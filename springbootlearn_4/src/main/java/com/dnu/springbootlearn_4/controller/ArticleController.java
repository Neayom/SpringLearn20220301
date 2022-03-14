package com.dnu.springbootlearn_4.controller;

import com.dnu.springbootlearn_4.AjaxResponse;
import com.dnu.springbootlearn_4.entity.Article;
import com.dnu.springbootlearn_4.entity.Reader;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by lgx on 2022/3/13.
 * 查询和删除用到id
 * 修改和新增用到 @RequestBody
 * 修改和删除需要对是否包含id进行判断
 */
@RestController
@Slf4j
@Data
@RequestMapping("/rest")
public class ArticleController {

    //查询一篇文章，根据id
    @GetMapping("/articels/{id}")
    public AjaxResponse getArtical(@PathVariable Long id){
        List<Reader> readers = new ArrayList<>();
        readers.add(new Reader("james",22));
        readers.add(new Reader("hadeng",23));
        Article artical = Article.builder()
                .id(3l)
                .author("lgx")
                .content("Spring-boot 从青铜到王者")
                //.createTime(new Date())
                .title("t1")
                .read(readers)
                .build();
        log.info("article:"+ artical);
        return AjaxResponse.success(artical);
    }

    //新增一篇文章
    //requestBody可以实现对象里面有数组，数组里面还有对象的形式，是@RequestParam无法做到的
    @PostMapping("/article")
    public AjaxResponse saveArtical(@RequestBody Article artical){
        log.info("saveArticle:"+ artical);
        return AjaxResponse.success(artical);
    }

    //修改一篇文章
    @PutMapping("/article")
    public AjaxResponse updateArtical(@RequestBody Article article){
        if(article.getId() == null) {
            //TODO 抛出一个自定义的异常
        }
        log.info("updateArticle:"+ article);
        return AjaxResponse.success();
    }

    //删除一篇文章
    @DeleteMapping("/articels/{id}")
    public AjaxResponse deleteArtical(@PathVariable Long id){
        if(id == null) {
            //TODO 抛出一个自定义的异常
        }
        log.info("deleteArtical"+id);
        return AjaxResponse.success(id,"删除"+id+"成功");
    }
}
