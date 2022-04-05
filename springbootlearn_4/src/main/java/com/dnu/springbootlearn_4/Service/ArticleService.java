package com.dnu.springbootlearn_4.Service;

import com.dnu.springbootlearn_4.Dao.ActiveDao;
import com.dnu.springbootlearn_4.Mapper.ArticleMapper;
import com.dnu.springbootlearn_4.entity.Article;
import org.dozer.Mapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lgx on 2022/3/23.
 */
@Service
public class ArticleService implements ArticleServiceImpl {

    @Resource
    ArticleMapper articleMapper;
    @Resource
    ActiveDao activeDao;
    @Resource
    private JdbcTemplate primaryJdbcTemplate;
    @Resource
    private JdbcTemplate secondaryJdbcTemplate;


    @Transactional
    @Override
    public void saveArticle(Article article) {
       articleMapper.insert(article);
    }

    @Override
    public void deleteArticle(Long id) {
      activeDao.deleteById(id,secondaryJdbcTemplate);
        activeDao.deleteById(id,primaryJdbcTemplate);
    }

    @Override
    public void updateArticle(Article article) {
           activeDao.updateById(article,null);
    }

    @Override
    public Article getArticle(Long id) {
       return activeDao.findById(id,null);
    }

    @Override
    public List<Article> getAll() {
        return articleMapper.selectList(null);
    }
}
