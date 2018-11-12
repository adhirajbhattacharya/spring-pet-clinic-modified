package com.adhiraj.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.adhiraj.clinic.model.service.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {
  
  private final OwnerService ownerService;

  public OwnerController(OwnerService ownerService) {
    super();
    this.ownerService = ownerService;
  }

  @RequestMapping({"", "/index", "/index.html"})
  public String listVets(Model model) {
    model.addAttribute("owners", ownerService.findAll());
    return "owners/owner-index";
  }

}
