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
public class PersonController {
	
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public String showForm(Model model) {
	    PersonForm person = new PersonForm();
	    model.addAttribute("person", person);
	    List<String> countries = Arrays.asList("USA", "Canada", "Mexico", "Brazil", "Argentina");
	    model.addAttribute("countries", countries);
	    return "person.jsp";
	}
	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public String submit(@ModelAttribute("person") PersonForm person, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "person.jsp";
		}
		model.addAttribute("name", person.getName());
		model.addAttribute("country", person.getCountry());
		return "personResult.jsp";
	}
}
