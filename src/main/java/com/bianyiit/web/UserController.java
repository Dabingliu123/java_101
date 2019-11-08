package com.bianyiit.web;

import com.bianyiit.domain.User;
import com.bianyiit.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> all = userService.findAll();
        System.out.println(all);
        modelAndView.addObject("list",all);
        modelAndView.setViewName("hello");
        return modelAndView;
    }
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        userService.saveUser(user);
        return "redirect:findAll";
    }
}
