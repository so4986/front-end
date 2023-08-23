package blog.com.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import blog.com.model.entity.AccountEntity;
import blog.com.model.entity.BlogEntity;
import blog.com.service.BlogService;
import jakarta.servlet.http.HttpSession;

@Controller
public class BlogController {
	@Autowired
	private BlogService blogService;
	@Autowired
	private HttpSession session;

	@GetMapping("/blog/list")
	public String getBlogListPage(Model model) {
		AccountEntity account = (AccountEntity) session.getAttribute("user");
		if (account == null) {
			return "login.html";
		} else {
			List<BlogEntity> blogList = blogService.selectAll(account.getAccountId());
			model.addAttribute("accountName", account.getAccountName());
			model.addAttribute("blogList", blogList);
			return "blog-list.html";
		}
	}

	@PostMapping("/blog/register/process")
	public String blogRegister(@RequestParam String blogTitle, @RequestParam String categoryName,
			@RequestParam MultipartFile blogImage, @RequestParam String article, Model model) {
		/**
		 * セッションから現在のユーザー情報を取得するため、sessionオブジェクトを使用しています。
		 * UserEntityのインスタンスが取得できた場合、そのuserIdを取得しています。
		 **/
		AccountEntity account = (AccountEntity) session.getAttribute("user");
		Long accountId = account.getAccountId();
		/**
		 * 現在の日時情報を元に、ファイル名を作成しています。SimpleDateFormatクラスを使用して、日時のフォーマットを指定している。
		 * 具体的には、"yyyy-MM-dd-HH-mm-ss-"の形式でフォーマットされた文字列を取得している。
		 * その後、blogImageオブジェクトから元のファイル名を取得し、フォーマットされた日時文字列と連結して、fileName変数に代入
		 **/
		String fileName = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-").format(new Date())
				+ blogImage.getOriginalFilename();
		try {
			/**
			 * ファイルを実際にサーバー上に保存するための処理を行っています。Files.copy()メソッドを使用して、
			 * blogImageオブジェクトから入力ストリームを取得し、指定されたパスにファイルをコピー。
			 * Path.of()メソッドを使用して、保存先のパスを指定している。
			 * 保存先のパスは、"src/main/resources/static/blog-img/"というディレクトリの中に
			 * 、fileNameで指定されたファイル名で保存される。。
			 **/
			Files.copy(blogImage.getInputStream(), Path.of("src/main/resources/static/blog_images/" + fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		/**
		 * 最後に、blogService.createBlogPost()メソッドが呼び出され、入力されたデータをデータベースに保存します。
		 * blogTitle、registerDate、fileName、blogDetail、category、userIdの各引数を使用して、BlogEntityオブジェクトを生成し、
		 * blogDao.save()メソッドを使用して、データベースに保存します。
		 * createBlogPost()メソッドはboolean型の戻り値を返します。trueが返された場合は、blog-register-fix.htmlページが表示され、
		 * falseが返された場合は、既に登録済みであることを示すメッセージが含まれたblog-register.htmlページが表示されます。
		 **/
		if (blogService.createBlog(blogTitle, categoryName, fileName, article, accountId)) {
			return "redirect:/blog/list";
		} else {
			return "redirect:/login";
		}

	}
}
