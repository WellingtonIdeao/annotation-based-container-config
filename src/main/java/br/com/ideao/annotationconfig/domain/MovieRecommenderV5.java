package br.com.ideao.annotationconfig.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class MovieRecommenderV5 {

    private Set<MovieCatalog> movieCatalogs;

    @Autowired
    public void setMovieCatalogs(Set<MovieCatalog> movieCatalogs) {
        this.movieCatalogs = movieCatalogs;
    }
    @Override
    public String toString() {
        return "MovieRecommenderV5{" +
                "movieCatalogs=" + movieCatalogs +
                '}';
    }
}
