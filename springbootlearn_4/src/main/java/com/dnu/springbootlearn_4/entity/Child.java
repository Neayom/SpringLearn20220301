package com.dnu.springbootlearn_4.entity;

import lombok.Data;

/**
 * Created by lgx on 2022/3/18.
 */
@Data
public class Child {

    private String name;

    private Integer age;

    private Friends[] friends;
}
