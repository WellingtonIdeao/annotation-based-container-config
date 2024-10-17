package br.com.ideao.annotationconfig.domain;

public class MovieCatalog {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MovieCatalog{" +
                "name='" + name + '\'' +
                '}';
    }
}
