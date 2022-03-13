package com.dnu.springbootlearn_4.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Created by lgx on 2022/3/13.
 */
@Data
@Builder
public class Artical {
    private Long id;
    private String author;
    private String title;
    private String content;
    private Date createTime;
}
