package com.tubanurbalci.springboot.tutorials.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {

    private Long id;
    private String beanName;
    private String beanData;

    //initial
    public void initialBeanMethod(){
        log.info("Before the Bean starts");
        System.out.println("Method to run before bean start");
    }


    //end
    public void destroyBeanMethod(){
        log.info("After the Bean stop");
        System.err.println("Method to run after bean finishes");
    }

}
