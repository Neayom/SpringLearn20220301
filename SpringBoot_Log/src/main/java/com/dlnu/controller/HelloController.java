package com.dlnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by lgx on 2022/3/8.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/world")
    @ResponseBody
    public String helloWorld(){
        return "hello111111232323";
    }
}
