package designpattern.observer;

import designpattern.observer.config.SpringObserverConfiguration;
import designpattern.observer.spring.MyPublisher;
import designpattern.observer.spring.movie.SpringMovie;
import designpattern.observer.spring.tv.SpringTv;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring中的观察者模式
 * 四个角色：1.事件；2.事件监听；3.事件发布；4.事件管理
 *
 * @author cy
 */
public class SpringTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringObserverConfiguration.class);
        MyPublisher publisher = context.getBean(MyPublisher.class);
        SpringMovie movie = new SpringMovie("movie");
        movie.update();
        publisher.publishMovieEvent(movie);

        System.out.println("------------------------");

        SpringTv tv = new SpringTv("tv");
        tv.update();
        publisher.publishTvEvent(tv);
    }
}
