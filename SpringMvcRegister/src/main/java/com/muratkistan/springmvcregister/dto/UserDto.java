package com.muratkistan.springmvcregister.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//Lombok Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class UserDto {

    @NotEmpty(message = "FirstName alani bos gecilemez")
    private String firstName;

    @NotEmpty(message = "LastName alani bos gecilemez")
    private String lastName;

    @NotEmpty(message = "Email alani bos gecilemez")
    @Email(message="Mailinizi uygun formatta yaziniz")
    private String emailAddress;


    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message="Sifrenizde en az 1 kucuk harf , 1 buyuk harf ve 1 rakam bulunmalidir")
    private String password;



}
