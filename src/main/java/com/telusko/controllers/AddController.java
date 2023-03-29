package com.telusko.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.telusko.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/addTwoNumbers")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
		int k = i + j;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addResult");
		mv.addObject("result", k);
		return mv;

	}

}
