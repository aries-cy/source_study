package designpattern.observer.spring.movie;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 人（观察者/事件监听）
 *
 * @author cy
 */
@Component
public class SpringUserB implements ApplicationListener<SpringMovie> {


    /**
     * 监听到事件，作出反应
     * @param movie 电影
     */
    @Override
    public void onApplicationEvent(SpringMovie movie) {
        System.out.println("SpringUserB看到电影情节改变笑了");
    }
}
