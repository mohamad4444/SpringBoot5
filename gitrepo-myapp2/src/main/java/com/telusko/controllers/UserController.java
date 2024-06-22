package com.telusko.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

import com.telusko.forms.User;
import com.telusko.validator.*;

@Controller
@RequestMapping("/register")
public class UserController {

  private final UserValidator userValidator;

  @Autowired
  public UserController(UserValidator userValidator) {
    this.userValidator = userValidator;
  }

  @RequestMapping(method = RequestMethod.GET)
  public String showForm(@ModelAttribute("user") User user) {
    return "register.jsp";
  }

  @RequestMapping(method = RequestMethod.POST)
  public String processForm(@ModelAttribute("user") User user, BindingResult result) {
    userValidator.validate(user, result);
    if (result.hasErrors()) {
      return "register.jsp";
    }

    // save user here

    return "redirect:/success.jsp";
  }
}
