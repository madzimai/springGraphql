package com.example.demoGraphql;


import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ArticleController {

    @QueryMapping
    public Article articleById(String id) {
        return Article.getById(id);
    }

    @SchemaMapping
    public Author author(Article article) {
        return Author.getById(article.authorId());
    }
}


