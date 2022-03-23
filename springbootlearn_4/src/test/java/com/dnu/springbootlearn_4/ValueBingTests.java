package com.dnu.springbootlearn_4;

import com.dnu.springbootlearn_4.entity.Family;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ValueBingTests {

    @Resource
    Family family;

    @Test
    public void valueBindTest() {
        System.out.println(family.toString());
    }

}
