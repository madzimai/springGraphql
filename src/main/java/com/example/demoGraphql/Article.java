package com.example.demoGraphql;

import java.util.List;
import java.util.Arrays;

public record  Article ( String id, String title, int wordCount, String authorId) {

    private static List<Article> articles = Arrays.asList(
            new Article("article-1", "Effective Java: Best Practices", 4500, "author1")

    );

    public static Article getById(String id) {
        return articles.stream()
                .filter(article -> article.id().equals(id))
                .findFirst()
                .orElse(null);
    }

}
