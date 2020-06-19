package designpattern.observer.spring.movie;

import org.springframework.context.ApplicationEvent;

/**
 * 电影（被观察者/事件）
 *
 * @author cy
 */
public class SpringMovie extends ApplicationEvent {


    public void update(){
        System.out.println("电影情节发生改变");
    }


    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source 事件源
     */
    public SpringMovie(Object source) {
        super(source);
    }
}
