package com.ll.exam.sb_mybatis.app.article.service;

import com.ll.exam.sb_mybatis.app.article.dto.Article;
import com.ll.exam.sb_mybatis.app.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getArticles() {
        return articleRepository.getArticles();
    }

    public long write(String subject, String content) {
        articleRepository.write(subject, content);

        return articleRepository.getLastInsertId();
    }
}
