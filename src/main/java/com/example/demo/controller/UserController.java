package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
@Api(tags="增加用户Controller")
public class UserController {

    @Autowired
    private UserService userService;
    @ApiOperation(value = "实现增加用户")
    @PostMapping("saveUser")
    @ResponseBody
    public void save(User user){
        userService.save(user);
    }
}
