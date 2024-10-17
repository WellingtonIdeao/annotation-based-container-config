package br.com.ideao.annotationconfig;

import br.com.ideao.annotationconfig.domain.MovieRecommender;
import br.com.ideao.annotationconfig.domain.MovieRecommenderV2;
import br.com.ideao.annotationconfig.domain.MovieRecommenderV3;
import br.com.ideao.annotationconfig.domain.SimpleMovieLister;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        MovieRecommender movieRecommender = context.getBean("movieRecommender", MovieRecommender.class);
        System.out.println(movieRecommender);

        SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
        System.out.println(simpleMovieLister);

        MovieRecommenderV2 movieRecommenderV2 = context.getBean("movieRecommenderV2", MovieRecommenderV2.class);
        System.out.println(movieRecommenderV2);

        MovieRecommenderV3 movieRecommenderV3 = context.getBean("movieRecommenderV3", MovieRecommenderV3.class);
        System.out.println(movieRecommenderV3);

        context.registerShutdownHook();
    }
}
