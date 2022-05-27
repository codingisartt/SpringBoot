package com.tubanurbalci.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    // http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
//  @ResponseBody  // It shows directly without redirecting to any page.
    public  String getThymeleaf1(){
        return "thymeleaf1";
    }

    // http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model){
        model.addAttribute("key_model1","This part coming from Model-1");
        model.addAttribute("key_model2","This part coming from Model-2");

        return "thymeleaf1";
    }

    // http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model){
        model.addAttribute("key_model1","This part coming from Model-1");
        model.addAttribute("key_model2","This part coming from Model-2");

        return "thymeleaf_file/thymeleaf3";
    }
}
