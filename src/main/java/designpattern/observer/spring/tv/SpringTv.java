package designpattern.observer.spring.tv;

import org.springframework.context.ApplicationEvent;

/**
 * SpringTv
 *
 * @author cy
 */
public class SpringTv  extends ApplicationEvent {

    private String tv;

    public void update(){
        System.out.println("电视剧情节发生改变");
    }


    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public SpringTv(Object source,String tv) {
        super(source);
        this.tv = tv;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }
}
