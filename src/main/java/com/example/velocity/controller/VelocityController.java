package com.example.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.velocity.service.UserService;

@Controller
public class VelocityController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String userInfo(@ModelAttribute("model") ModelMap model) throws Exception {
		model.addAttribute("users", userService.getUserData());
		return "userDetails";
	}
}
