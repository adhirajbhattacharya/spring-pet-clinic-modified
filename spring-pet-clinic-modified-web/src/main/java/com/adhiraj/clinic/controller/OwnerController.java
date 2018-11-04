package com.adhiraj.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

  @RequestMapping({"", "/index", "/index.html"})
  public String listVets(Model model) {
    return "owners/owner-index";
  }

}
