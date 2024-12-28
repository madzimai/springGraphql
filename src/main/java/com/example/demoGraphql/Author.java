package com.example.demoGraphql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public record Author(String id, String firstName, String lastName) {
    private static List<Author> authors = Arrays.asList(
     new Author("author-2", "Douglas", "Adams")

    );
    public static Author getById(String id) {
        return authors.stream()
                .filter(author -> author.id().equals(id))
                .findFirst()
                .orElse(null);
    }


}
