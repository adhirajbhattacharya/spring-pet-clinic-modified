package com.adhiraj.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {

  // by default "", "/" are mapped to page named index.html
  
  @RequestMapping({"", "/index", "/index.html"})
  public String index() {
    return "index";
  }
  
  @RequestMapping("/oups")
  public String handleOops() {
    return "not-implemented";
  }

}
