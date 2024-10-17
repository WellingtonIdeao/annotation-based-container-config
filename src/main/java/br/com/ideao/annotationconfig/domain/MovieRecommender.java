package br.com.ideao.annotationconfig.domain;

import br.com.ideao.annotationconfig.repository.CustomerPreferenceDao;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {

    private final CustomerPreferenceDao customerPreferenceDao;

    @Autowired
    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }

    @Override
    public String toString() {
        return "MovieRecommender{" +
                "customerPreferenceDao=" + customerPreferenceDao +
                '}';
    }
}
