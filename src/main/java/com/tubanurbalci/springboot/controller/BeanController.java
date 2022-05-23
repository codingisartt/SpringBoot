package com.tubanurbalci.springboot.controller;

import com.tubanurbalci.springboot.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @Autowired // Inject in Spring
    BeanConfig beanConfig;

    // http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto") // url
    @ResponseBody // show directly on screen without Html etc
    public String getBeanDto(){
        return beanConfig.beanDto()+"";
    }
}
