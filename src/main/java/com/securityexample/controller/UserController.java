package com.securityexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.securityexample.model.User;
import com.securityexample.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/register")
	public String showRegisterPage() {
		return "RegisterPage";
	}

	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user, Model model) {
		model.addAttribute("user", new User());
		System.out.println(user);
		Integer id = userService.saveUser(user);
		String msg = "User '" + id + " ' saved";
		model.addAttribute("message", msg);
		return "RegisterPage";
	}

	@RequestMapping("/home")
	public String showHomePage() {
		return "Home";
	}

	@RequestMapping("/welcome")
	public String showWelcomePage() {
		return "Welcome";
	}

	@RequestMapping("/admin")
	public String showAdminPage() {
		return "Admin";
	}

	@RequestMapping("/student")
	public String showStudentPage() {
		return "Student";
	}

	@RequestMapping("/emp")
	public String showEmp() {
		return "Emp";
	}

	@RequestMapping("/denied")
	public String showDenied() {
		return "DeniedPage";
	}

	@RequestMapping("/login")
	public String showLoginPage() {
		return "LoginPage";
	}

}
