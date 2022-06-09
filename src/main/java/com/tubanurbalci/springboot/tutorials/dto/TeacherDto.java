package com.tubanurbalci.springboot.tutorials.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {

    private Long teacherId;

    @NotEmpty(message = "\n" +
            "You cannot leave the first and last name fields blank.")
    @Size(min = 1,max = 255)
    private String teacherNameSurname;

    @NotEmpty(message = "You did not enter an email in the appropriate format.")
    @Email(message = "\n" +
            "You did not enter an email in the appropriate format.")
    private String teacherEmail;

    @NotEmpty(message = "You cannot leave the password field blank.")
//  @Min(value = 10,message = "Minimum 10 character")
//  @Min(value = 18,message = "Maximum 18 character")
    @Size(min = 10,max = 18)
    private String teacherPassword;
}
