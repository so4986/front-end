package Ex.com.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Ex.com.ex.model.entity.AccountEntity;
import Ex.com.ex.model.entity.BlogEntity;
import Ex.com.ex.service.BlogService;
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
		if(account==null) {
			return"login.html";
		}else {
			List<BlogEntity> blogList = blogService.selectAll(account.getAccountId());
			model.addAttribute("accountName", account.getAccountName());
			model.addAttribute("blogList", blogList);
			return "blog-list.html";
		}
		/*Long accountId = accountList.getAccountId();
		String accountName = accountList.getAcconutName();
		List<BlogEntity> blogList = blogService.findAllBlogPost(accountId);
		model.addAttribute("accountName", accountName);
		model.addAttribute("blogList", blogList);
		return "blog-list.html"; */
	}
}
