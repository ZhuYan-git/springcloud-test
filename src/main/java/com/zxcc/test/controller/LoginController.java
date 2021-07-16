package com.zxcc.test.controller;

import com.zxcc.test.model.User;
import com.zxcc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){

        return "login";
    }

    @RequestMapping(value = "loginIn",method = RequestMethod.POST)
    public String  login(String name,String password){

        User user = userService.getInfo(name, password);
        if(StringUtils.isEmpty(user)){

            return "error";

        }else {
            return "success";
        }


    }

}
