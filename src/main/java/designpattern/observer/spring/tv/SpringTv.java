package designpattern.observer.spring.tv;

import org.springframework.context.ApplicationEvent;

/**
 * SpringTv
 *
 * @author cy
 */
public class SpringTv  extends ApplicationEvent {


    public void update(){
        System.out.println("电视剧情节发生改变");
    }


    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public SpringTv(Object source) {
        super(source);
    }
}
