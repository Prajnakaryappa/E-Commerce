package com.jsp.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.ecommerce.dto.AdminDto;
import com.jsp.ecommerce.dto.UserDto; 

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;

	
	@GetMapping("/register")
public String loadRegister(UserDto userDto , Model model) 
	{	
 return adminService.register(userDto, model);
}
	
	@PostMapping("/regiter")
	public String register(@Valid UserDto userDto, BindingResult result){
		return  return adminService.register(userDto, model);
	}
		//TODO: process POST request
}