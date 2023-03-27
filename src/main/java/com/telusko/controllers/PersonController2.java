package com.telusko.controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.telusko.forms.*;

@Controller
public class PersonController2 {
	
	@RequestMapping(value = "/person2", method = RequestMethod.GET)
	public String showForm(Model model) {
	    Person2 person2 = new Person2();
	    model.addAttribute("person2", person2);
	    return "person2.jsp";
	}
	@RequestMapping(value = "/person2", method = RequestMethod.POST)
	public String submit(@ModelAttribute("person2") Person2 person2, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "person2.jsp";
		}
		model.addAttribute("name", person2.getName());
		model.addAttribute("age", person2.getAge());
		return "personResult2.jsp";
	}
}
