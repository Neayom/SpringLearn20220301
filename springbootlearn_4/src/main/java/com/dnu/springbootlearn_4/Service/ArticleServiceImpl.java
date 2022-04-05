package com.dnu.springbootlearn_4.Service;

import com.dnu.springbootlearn_4.entity.Article;

import java.util.List;

public interface ArticleServiceImpl {
    void saveArticle(Article article);

    void deleteArticle(Long id);

    void updateArticle(Article article);

    Article getArticle(Long id);

    List<Article> getAll();
}
