package br.com.ideao.annotationconfig.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class MovieRecommenderV4 {

    @Autowired
    private MovieCatalog[] movieCatalogs;

    @Override
    public String toString() {
        return "MovieRecommenderV4{" +
                "movieCatalogs=" + Arrays.toString(movieCatalogs) +
                '}';
    }
}
