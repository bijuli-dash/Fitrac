package com.demo.demolo.webcontroller;


import com.demo.demolo.entity.User;
import com.demo.demolo.utils.Encription;
import com.demo.demolo.utils.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class user_registration_controller
{
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String registerationForm( )  /*method handler*/
    {
        return "reg";
    }
    @PostMapping("/register")
    public String registerUser(User user){
        System.out.println(user.getName());
        try{
            user.setPassword(Encription.encrypt(user.getPassword()));
            userService.createUser(user);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "redirect:/homepage";
    }

}
