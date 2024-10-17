package br.com.ideao.annotationconfig.domain;

import br.com.ideao.annotationconfig.repository.CustomerPreferenceDao;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommenderV2 {

    private MovieCatalog movieCatalog;
    private CustomerPreferenceDao customerPreferenceDao;

    @Autowired
    public void prepare(MovieCatalog movieCatalog, CustomerPreferenceDao customerPreferenceDao) {
        this.movieCatalog = movieCatalog;
        this.customerPreferenceDao = customerPreferenceDao;
    }

    @Override
    public String toString() {
        return "MovieRecommenderV2{" +
                "movieCatalog=" + movieCatalog +
                ", customerPreferenceDao=" + customerPreferenceDao +
                '}';
    }
}
