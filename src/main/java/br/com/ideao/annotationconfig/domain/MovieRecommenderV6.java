package br.com.ideao.annotationconfig.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class MovieRecommenderV6 {

    private Map<String, MovieCatalog> movieCatalogs;

    @Autowired
    public void setMovieCatalogs(Map<String, MovieCatalog> movieCatalogs) {
        this.movieCatalogs = movieCatalogs;
    }

    @Override
    public String toString() {
        return "MovieRecommenderV6{" +
                "movieCatalogs=" + movieCatalogs +
                '}';
    }
}
