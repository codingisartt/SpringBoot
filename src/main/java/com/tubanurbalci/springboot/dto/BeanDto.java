package com.tubanurbalci.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Log4j
@Builder
public class BeanDto {

    private Long id;
    private String beanName;
    private String beanData;


}
