package com.dlnu.springboot3;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lgx on 2022/3/1.
 */
@Profile("prod")
@Controller
@RequestMapping("/Hello")
public class HelloController {
    @RequestMapping("/world")
    @ResponseBody
    public String Hello(){
        System.out.println("HEllo");
        return "hello";
    }
}
