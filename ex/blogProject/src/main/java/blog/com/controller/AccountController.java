package blog.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import blog.com.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;

	@GetMapping("/register")
	public String getUserRegisterpage() {
		return "register.html";
	}

	@PostMapping("/register/process")
	public String register(@RequestParam String accountName, @RequestParam String accountEmail,
			@RequestParam String password) {
		if (accountService.createAccount(accountName, accountEmail, password)) {
			return "login.html";
		} else {
			return "register.html";
		}
	}
}
