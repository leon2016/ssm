package com.leon.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leon.ssm.bo.User;
import com.leon.ssm.service.IUserService;

@Controller
@RequestMapping("/sys")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/user/{id}")
	public String toIndex(HttpServletRequest request, @PathVariable("id") int userId, Model model) {
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "user";
	}
}
