package com.jsp.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;

import com.jsp.ecommerce.dto.UserDto;
import com.jsp.ecommerce.repository.AdminRepository;
import com.jsp.ecommerce.repository.CustomerRepository;
import com.jsp.ecommerce.repository.MerchantRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminRespository;
	
	@Autowired
	CustomerRepository customerRepository ;
	
	@Autowired
	MerchantRepository merchnatRepository ;
	
	//@Override
	public String register(UserDto userDto, Model model) {
		model.addAttribute("userDto",userDto);
		return "customer-register.html";
	}

	//@Override
	public String register(UserDto userDto, BindingResult result) {
		
		if(!userDto.getPassword().equals(userDto.getConfirmPassword()))
			result.rejectValue("confirmPassword", "error.confirmPassword","*password and confirm password not matching");
		
		if(adminRepository.existsByEmail(userDto.getEmail()) || customerRepository.existsByEmail(userDto.getEmail()) || merchantRepository.existsByEmail(userDto.getEmail()))
			
			return.rejectValue("email","error.email","*Eamil Already Exists");
		
		if(result.hasErrors()) {
			return "customer-register.html";
			}
			return "redirect:/";
		}

	@Override
	public String register(UserDto userDto, ch.qos.logback.core.model.Model model) {
		// TODO Auto-generated method stub
		return null;
	}

	}

	
	