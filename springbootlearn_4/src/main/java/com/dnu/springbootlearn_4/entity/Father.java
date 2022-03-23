package com.dnu.springbootlearn_4.entity;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;

/**
 * Created by lgx on 2022/3/18.
 */
@Data
@Validated
public class Father {
    private String name;
    @Min(21)
    private Integer age;
}
