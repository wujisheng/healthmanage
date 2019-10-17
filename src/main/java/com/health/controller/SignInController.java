package com.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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


    @RequestMapping("/signin")
    public String SignIn(String name,String password){

        if (name == "wjs" && password == "123456"){
            return "success";
        }else {
            return "signin";
        }
    }

    @RequestMapping("/")
    public String index(){
        return "success";
    }

    @RequestMapping("/test")
    public String test(){
        return "signin";
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
