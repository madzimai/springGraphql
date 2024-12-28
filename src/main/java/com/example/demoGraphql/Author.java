package com.example.demoGraphql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public record Author(String id, String firstName, String lastName) {
    private static List<Author> authors = Arrays.asList(
    new Author("author-1", "Joshua", "Bloch"),
     new Author("author-2", "Douglas", "Adams"),
    new Author("author-3", "Bill", "Bryson")
    );
    public static List<Author> getById( String id) {
        return Collections.singletonList(authors.stream()
                .filter(author -> Boolean.parseBoolean(author.id()))
                .findFirst()
                .orElse(null));

    }

}
