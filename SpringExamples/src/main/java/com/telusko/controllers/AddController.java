package com.telusko.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.telusko.service.AddService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
  private static final Logger log = LogManager.getLogger(AddController.class);

  @RequestMapping("/add")
  public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
    int k = i + j;
    ModelAndView mv = new ModelAndView();
    mv.setViewName("addResult.jsp");
    mv.addObject("result", k);
    log.info("adding two values{}",true);
    return mv;

  }

}
