package com.telusko.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.telusko.forms.GroceryForm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

@Controller
@SessionAttributes("GroceryForm") // GroceryFrom class
@RequestMapping("/GroceryItems.do") // site to call for this class to be called
public class GroceryItemsController {
  @Autowired
  private HttpServletRequest request;
  @Autowired
  private HttpSession session;

  @ModelAttribute("groceryForm")
  public GroceryForm createGroceryForm() {
    GroceryForm form = new GroceryForm();
    LinkedList<String> categories = new LinkedList<String>();
    categories.add("member");
    categories.add("tabac");
    form.setCategoryOptions(categories);
    form.setTextArea("line1\nline2\nline3");
    return form;
  }

  @RequestMapping(method = RequestMethod.GET)
  public String default_method(@ModelAttribute("groceryForm") GroceryForm form, HttpServletRequest request) {
    String param = request.getParameter("test");
    return "GroceryItems2.jsp";
  }

  // @GetMapping
  // public String showForm(Model model) {
  // model.addAttribute("GroceryForm", new GroceryForm());
  // logger.info("showingForm");
  // return "showGroceryItems.jsp";
  // }
  @RequestMapping(params = "action=submitForm")
  public String submitForm(@ModelAttribute("groceryForm") GroceryForm form) {
    return "showGroceryItems.jsp";
  }

  @RequestMapping(params = "action=upload", method = RequestMethod.POST)
  public String handleFormUpload(@ModelAttribute("groceryForm") GroceryForm groceryForm) {
    if (groceryForm.getFiles() != null && !groceryForm.getFiles().isEmpty()) {
      try {
        // Get the filenames of the uploaded files
        List<String> fileNames = new ArrayList<>();
        for (MultipartFile file : groceryForm.getFiles()) {
          String fileName = file.getOriginalFilename();
          fileNames.add(fileName);

          // Create a Path object for the location where we want to save the file
          Path filePath = Paths.get("uploads", fileName);

          // Save the file to the file system
          Files.createDirectories(filePath.getParent());
          Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
        }

        // Update the model with the paths to the uploaded files
        groceryForm.setFilePaths(fileNames);
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else {
    }

    return "showGroceryItems.jsp";
  }

}
