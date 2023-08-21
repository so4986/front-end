package Ex.com.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Ex.com.ex.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String getUserRegisterpage() {
		return "register.html";
	}

	@PostMapping("/register/process")
	public String register(@RequestParam String accountName,@RequestParam String accountEmail,@RequestParam String password) {
		userService.createAccount(accountName, accountEmail, password);
		return "redirect:/admin/login";
	}
}
