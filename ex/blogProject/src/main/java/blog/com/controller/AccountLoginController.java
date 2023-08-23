package blog.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import blog.com.model.entity.AccountEntity;
import blog.com.service.AccountService;
import jakarta.servlet.http.HttpSession;

@Controller
public class AccountLoginController {
	@Autowired
	private AccountService accountService;
	@Autowired
	private HttpSession session;

	@GetMapping("/login")
	public String getLoginPage() {
		return "login.html";
	}

	@PostMapping("/login/process")
	public String login(@RequestParam String accountEmail, @RequestParam String password) {

		AccountEntity accountList = accountService.loginAccount(accountEmail, password);
		if (accountList == null) {
			return "redirect:/login";
		} else {
			session.setAttribute("user", accountList);
			return "redirect:/blog/list";
		}

	}
}
