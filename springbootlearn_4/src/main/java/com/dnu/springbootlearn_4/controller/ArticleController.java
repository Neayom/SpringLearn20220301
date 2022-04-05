package com.dnu.springbootlearn_4.controller;

import com.dnu.springbootlearn_4.AjaxResponse;
import com.dnu.springbootlearn_4.Service.ArticleServiceImpl;
import com.dnu.springbootlearn_4.entity.Article;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
/**
 *         "id": 2,
 *         "author": "lgx",
 *         "title": "t2",
 *         "content": "Spring-boot",
 *         "createTime": "2022-03-23 20:39:15"
 */


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
    @Resource
    private ArticleServiceImpl articleService;

    //查询一篇文章，根据id
    @GetMapping("/articels/{id}")
    public AjaxResponse getArtical(@PathVariable Long id){
        Article article = articleService.getArticle(id);
        log.info("article:"+ article);
        return AjaxResponse.success(article);
    }

    //新增一篇文章
    //requestBody可以实现对象里面有数组，数组里面还有对象的形式，是@RequestParam无法做到的
    @PostMapping("/article")
    public AjaxResponse saveArtical(@RequestBody Article artical){
        articleService.saveArticle(artical);
        log.info("saveArticle:"+ artical);
        return AjaxResponse.success(artical);
    }

    //修改一篇文章
    @PutMapping("/article")
    public AjaxResponse updateArtical(@RequestBody Article article){
        articleService.updateArticle(article);
        log.info("updateArticle:"+ article);
        return AjaxResponse.success();
    }

    //删除一篇文章
    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArtical(@PathVariable Long id){
        articleService.deleteArticle(id);
        log.info("deleteArtical"+id);
        return AjaxResponse.success(id,"删除"+id+"成功");
    }

    //GetAll
    @GetMapping("/articles/getAll")
    public AjaxResponse getAll(){
        List<Article> allArticle = articleService.getAll();
        log.info("getAll Article"+allArticle.iterator());
        return AjaxResponse.success();

    }
}
