package br.com.ideao.annotationconfig.domain;

import br.com.ideao.annotationconfig.repository.CustomerPreferenceDao;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommenderV3 {

    private final CustomerPreferenceDao customerPreferenceDao;

    @Autowired
    private MovieCatalog movieCatalog;

    @Autowired
    public MovieRecommenderV3(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }

    @Override
    public String toString() {
        return "MovieRecommenderV3{" +
                "customerPreferenceDao=" + customerPreferenceDao +
                ", movieCatalog=" + movieCatalog +
                '}';
    }
}
