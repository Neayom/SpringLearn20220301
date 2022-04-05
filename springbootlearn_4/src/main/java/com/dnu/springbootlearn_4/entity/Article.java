package com.dnu.springbootlearn_4.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;

/**
 * Created by lgx on 2022/3/13.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

//@JsonPropertyOrder(value = {"content","title"}) //改变子属性在JSON序列化中的默认定义的顺序
public class Article {
   // @JsonIgnore //排除掉一些敏感的信息(如id，密码)，不做序列化
    private Long id;
   // @JsonProperty("auther")
    private String author;
    private String title;
    private String content;
   // @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss",timezone = "GMT+8") // 指定日期类型的属性格式
    private Date createTime;
    //@JsonInclude(JsonInclude.Include.NON_NULL)  //排除为空的元素不做序列化反序列化
    //private List<Reader> read;
}
