package com.dnu.springbootlearn_4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by lgx on 2022/3/11.
 */
@Data
@Slf4j // private static final Logger log = LoggerFactory.getLogger(User.class);
@Builder //链式创建对象
@AllArgsConstructor //包含全参的构造函数
public class User {
    private String name;
    private Integer age;
    private String address;
}
