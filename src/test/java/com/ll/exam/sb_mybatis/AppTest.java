package com.ll.exam.sb_mybatis;

import com.ll.exam.sb_mybatis.app.article.dto.Article;
import com.ll.exam.sb_mybatis.app.article.service.ArticleService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest
class AppTest {
    @Autowired
    private ArticleService articleService;

    @Test
    @DisplayName("게시물 조회")
    void t1() {
        List<Article> articles = articleService.getArticles();
        System.out.println(articles);
    }

    @Test
    @DisplayName("게시물 작성")
    void t2() {
        long id = articleService.write("제목3", "내용3");

        assertThat(id).isGreaterThan(0);
    }
}