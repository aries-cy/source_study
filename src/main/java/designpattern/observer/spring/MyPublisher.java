package designpattern.observer.spring;

import designpattern.observer.spring.movie.SpringMovie;
import designpattern.observer.spring.tv.SpringTv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布
 *
 * @author cy
 */
@Component
public class MyPublisher  {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 发布事件
     * 监听该事件的监听者都可以获取消息
     *
     * @param event
     */
    public void publishMovieEvent(SpringMovie event) {
        //通知观察者
        applicationContext.publishEvent(event);
    }

    public void publishTvEvent(SpringTv event) {
        //通知观察者
        applicationContext.publishEvent(event);
    }
}
