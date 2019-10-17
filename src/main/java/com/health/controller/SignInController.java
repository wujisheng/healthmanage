package com.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SignInController {

    /*@RequestMapping("/signin")
    public String SignIn(HttpServletResponse response, HttpServletRequest request){

        String name = request.getQueryString("name");
        String name = request.getAttribute("name");
        return "success";

        return "signin"
    }*/


    @RequestMapping("/login")
    public String SignIn(String inputEmail,String inputPassword){

        if (inputEmail.equals("wjs@12") && inputPassword.equals("123456")){
            return "success";
        }else {
            return "signin";
        }
    }

    @RequestMapping("/")
    public String index(){
        return "signin";
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
