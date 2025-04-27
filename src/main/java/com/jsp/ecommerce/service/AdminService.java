package com.jsp.ecommerce.service;

import org.springframework.validation.BindingResult;

import com.jsp.ecommerce.dto.UserDto;

import ch.qos.logback.core.model.Model;

public interface AdminService {
	
	String register(UserDto userDto , Model model);
	
	String register(UserDto userDto , BindingResult result );
}
