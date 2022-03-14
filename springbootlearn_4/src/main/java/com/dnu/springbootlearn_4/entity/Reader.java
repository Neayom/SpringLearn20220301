package com.dnu.springbootlearn_4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lgx on 2022/3/13.
 */
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Reader {
    private String name;
    private Integer age;

}
