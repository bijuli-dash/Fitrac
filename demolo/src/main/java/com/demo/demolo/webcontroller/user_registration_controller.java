package com.demo.demolo.webcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class user_registration_controller
{
    @GetMapping("/")
    public String registrationform( )  /*method handler*/
    {
        return "reg";
    }
}
