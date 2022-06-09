package com.tubanurbalci.springboot.tutorials.controller;

import com.tubanurbalci.springboot.tutorials.bean.BeanConfig;
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

//  @Autowired
//  Logger LOG;

//  public BeanController() {
//      LOG.info("Log info is called");
//  }

    // We get null because the bean structure has not yet started and we can not inject dependency
    // Task: occurs immediately when an bean object occurs. (PostConstruct)
//  @PostConstruct
//  public void  init(){
//      LOG.info("Log info is called");
//  }

//  public static void main(String[] args) {
//      BeanController beanController=new BeanController();
//      System.out.println(beanController);
//  }
}
