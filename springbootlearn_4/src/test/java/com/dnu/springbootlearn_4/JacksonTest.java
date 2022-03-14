package com.dnu.springbootlearn_4;


import com.dnu.springbootlearn_4.entity.Article;
import com.dnu.springbootlearn_4.entity.Reader;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lgx on 2022/3/13.
 */
public class JacksonTest {

    @Test
    void testJackson() throws JsonProcessingException {
        List<Reader> readers = new ArrayList<>();
        readers.add(new Reader("james",22));
        readers.add(new Reader("hadeng",23));
        Article artical = Article.builder()
                .id(3l)
                .author("lgx")
                .content("Spring-boot 从青铜到王者")
               // .createTime(new Date())
                .title("t1")
                .read(readers)
                .build();
        ObjectMapper mapper = new ObjectMapper();
        String StringJson = mapper.writeValueAsString(artical);
        System.out.println(StringJson);
    }
}
