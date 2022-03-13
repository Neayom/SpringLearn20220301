package com.dnu.springbootlearn_4.controller;

import com.dnu.springbootlearn_4.AjaxResponse;
import com.dnu.springbootlearn_4.entity.Artical;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


/**
 * Created by lgx on 2022/3/13.
 * 查询和删除用到id
 * 修改和新增用到 @RequestBody
 * 修改和删除需要对是否包含id进行判断
 */
@RestController
@Slf4j
@Data
public class ArticalController {

    //查询一篇文章，根据id
    @GetMapping("/articels/{id}")
    public AjaxResponse getArtical(@PathVariable Long id){
        Artical artical = Artical.builder()
                .id(1l)
                .author("lgx")
                .content("Spring boot 从青铜到王者")
                .createTime(new Date())
                .title("t1")
                .build();
        log.info("article:"+ artical);
        return AjaxResponse.success(artical);
    }

    //新增一篇文章
    @PostMapping("/articels")
    public AjaxResponse saveArtical(@RequestBody Artical artical){
        log.info("saveArticle:"+ artical);
        return AjaxResponse.success();
    }

    //修改一篇文章
    @PutMapping("/articels")
    public AjaxResponse updateArtical(@RequestBody Artical artical){
        if(artical.getId() == null) {
            //TODO 抛出一个自定义的异常
        }
        log.info("updateArticle:"+ artical);
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
