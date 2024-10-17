package br.com.ideao.annotationconfig.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class SimpleMovieLister {

    private MovieFinder movieFinder;

    @Autowired
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public String toString() {
        return "SimpleMovieLister{" +
                "movieFinder=" + movieFinder +
                '}';
    }
}
