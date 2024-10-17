package br.com.ideao.annotationconfig.domain;

import org.springframework.beans.factory.annotation.Value;

public class MovieRecommenderV7 {

    private final String catalog;

    public MovieRecommenderV7(@Value("${catalog.name:defaultCatalog}") String catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "MovieRecommenderV7{" +
                "catalog='" + catalog + '\'' +
                '}';
    }
}
