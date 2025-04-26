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

	
	@GetMapping("/register")
public String loadRegister(AdminDto adminDto , Model model) 
	{	
 model.addAttribute("adminDto", adminDto);
 return "admin-register.html";
}
	
	@PostMapping("/regiter")
	public String register(@Valid AdminDto adminDto, BindingResult result){
		if(result.hasErrors()) {
			return "admin-reguster.html" ;
		}
		return "redirect:/" ;
	}
		//TODO: process POST request
}