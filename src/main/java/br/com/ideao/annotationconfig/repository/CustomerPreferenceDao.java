package br.com.ideao.annotationconfig.repository;

public class CustomerPreferenceDao {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomerPreferenceDao{" +
                "name='" + name + '\'' +
                '}';
    }
}
