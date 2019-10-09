package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {


    @RequestMapping("/")
    public String homePage()
    {
        return "index";
    }
    @PostMapping("/login")
    public ModelAndView login(HttpServletRequest request) {

        User user = new User(request.getParameter("userName"), request.getParameter("userPassword"));
        ModelAndView mv = new ModelAndView("display");
        mv.addObject("userName", user.getUserName());

        return mv;
    }

}