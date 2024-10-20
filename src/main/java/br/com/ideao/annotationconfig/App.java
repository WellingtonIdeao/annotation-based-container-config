package br.com.ideao.annotationconfig;

import br.com.ideao.annotationconfig.domain.*;
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

        MovieRecommenderV4 movieRecommenderV4 = context.getBean("movieRecommenderV4", MovieRecommenderV4.class);
        System.out.println(movieRecommenderV4);
        MovieRecommenderV5 movieRecommenderV5 = context.getBean("movieRecommenderV5", MovieRecommenderV5.class);
        System.out.println(movieRecommenderV5);

        MovieRecommenderV6 movieRecommenderV6 = context.getBean("movieRecommenderV6", MovieRecommenderV6.class);
        System.out.println(movieRecommenderV6);

        SimpleMovieLister2 simpleMovieLister2 = context.getBean("simpleMovieLister2", SimpleMovieLister2.class);
        System.out.println(simpleMovieLister2);

        MovieRecommenderV7 movieRecommenderV7 = context.getBean("movieRecommenderV7", MovieRecommenderV7.class);
        System.out.println(movieRecommenderV7);

        context.registerShutdownHook();
    }
}
