package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {


    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public User test(){
        return userService.getUser("admin001");
    }
    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }
    @GetMapping("/login-error")
    public ModelAndView loginError(HttpServletRequest request, Model model){
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","登录失败，账户或密码错误");
        return new ModelAndView("login","userModel",model);
    }


}
