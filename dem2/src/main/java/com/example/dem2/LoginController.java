package com.example.dem2;

import com.example.dem2.model.User;
import com.example.dem2.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private UserRepo userRepo;
    @RequestMapping("/")
    public String checkMVC(){
        return "login";
    }
    @RequestMapping("/login")
    public String loginHomePage(@RequestParam("userName")String userName, @RequestParam("password")String password , Model model) {
        User u=null;
        try {
            u = userRepo.findByName(userName);
        } catch (Exception e) {
            System.out.println("User not found");
            return "login";
        }
        if (u != null) {


            model.addAttribute("UserName", userName);
            return "homePage";
        }
        model.addAttribute("error","User not found in DB");
        return "login";
    }
    @RequestMapping("/register")
    public String goToRegistrationPage(){
        return "register";
    }
    @RequestMapping("/set-user")
    public String goToRegistrationMicroservice(){
        //code to go to registration microservice to register user
        return "login";
    }
}



