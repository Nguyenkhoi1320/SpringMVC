package pxu.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pxu.com.model.LoginModel;

@Controller
public class LoginController {
	public LoginController() {

	}
@ModelAttribute("loginmodel")
public LoginModel setLoginModel() {
return new LoginModel();
}
	@GetMapping("/login")
	public String loginForm() {
		return ("login");
	}

	@PostMapping("/login")
	public String saveUser(@ModelAttribute("login") LoginModel login, Model model) {
		if (login.getUsername() == "admin" && login.getPassword() == "12345") {
			model.addAttribute("message", "User login Successfully");	
		} else {
			model.addAttribute("message", "User Login failed");
		}
		model.addAttribute("myaccount", login);
		return "login-success";
	}

	}

