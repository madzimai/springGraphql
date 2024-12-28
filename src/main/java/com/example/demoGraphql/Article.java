package com.example.demoGraphql;

import java.util.List;
import java.util.Arrays;

public record  Article ( String id, String title, int wordCount, String authorId) {

    private static List<Article> articles = Arrays.asList(
            new Article("article-1", "Effective Java: Best Practices", 4500, "author1"),
            new Article("article-2", "The Hitchhiker's Guide to the Galaxy", 12000, "author2"),
            new Article("article-3", "A Short History of Nearly Everything", 9800, "author3")
    );


    public static Article getById(String id) {
        return articles.stream()
                .filter(article -> Boolean.parseBoolean(article.id()))
                .findFirst()
                .orElse(null);

    }
}
