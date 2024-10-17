package br.com.ideao.annotationconfig.domain;

import jakarta.annotation.Resource;

public class SimpleMovieLister2 {

    private MovieFinder movieFinder;

    @Resource(name = "movieFinder")
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public String toString() {
        return "SimpleMovieLister2{" +
                "movieFinder=" + movieFinder +
                '}';
    }
}
