package com.telusko.controllers;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {

  @PostMapping("upload")
  public String handleFileUpload(@RequestParam("file") MultipartFile file,@RequestParam("files") MultipartFile[] files, Model model) {
    try {
      String fileName = file.getOriginalFilename();
      File destFile = new File(System.getProperty("user.dir")+"/"+fileName);
      FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);
      model.addAttribute("message", "File uploaded successfully, file saved to "+System.getProperty("user.dir")+"/"+fileName);
    } catch (IOException ex) {
      model.addAttribute("message", "Error uploading file");
    }
    for(MultipartFile f :files) {
      try {
        String fileName = f.getOriginalFilename();
        File destFile = new File(System.getProperty("user.dir")+"/"+fileName);
        FileUtils.copyInputStreamToFile(f.getInputStream(), destFile);
        model.addAttribute("message", "File uploaded successfully, file saved to "+System.getProperty("user.dir")+"/"+f);
      } catch (IOException ex) {
        model.addAttribute("message", "Error uploading file");
      }
    }
    return "resultOfFileUpload.jsp";
  }

}
