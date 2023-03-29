package com.telusko.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.telusko.forms.GroceryForm;
import java.util.LinkedList;

@Controller
@SessionAttributes("GroceryForm") // GroceryFrom class
@RequestMapping("/GroceryItems.do") // site to call for this class to be called
public class GroceryItemsController {
	private static final Logger logger = LogManager.getLogger(GroceryItemsController.class);
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private HttpSession session;

	@ModelAttribute("GroceryForm")
	public GroceryForm createGroceryForm() {
		logger.info("creating new GroceryForm");
		GroceryForm form=new GroceryForm();
		LinkedList<String> categories=new LinkedList<String>();
		categories.add("member");
		categories.add("tabac");
		form.setCategoryOptions(categories);
		return form;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String default_method(@ModelAttribute("GroceryForm") GroceryForm form, HttpServletRequest request) {
		String param=request.getParameter("test");
		logger.info("returning GroceryItems.jsp");
		return "GroceryItems.jsp";
	}

//    @GetMapping
//    public String showForm(Model model) {
//        model.addAttribute("GroceryForm", new GroceryForm());
//        logger.info("showingForm");
//        return "showGroceryItems.jsp";
//    }
	@RequestMapping(params = "action=submitForm")
	public String submitForm(@ModelAttribute("GroceryForm") GroceryForm form) {
		logger.info("form submitted");
		return "showGroceryItems.jsp";
	}

}
