package com.dlnu.springboot3;

import com.dlnu.springboot3.Bean.User;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot3ApplicationTests {
    @Autowired
    private User user;

    @Test
    void contextLoads() {
        System.out.println(user);
    }

}
