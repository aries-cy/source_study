package designpattern.observer.spring.tv;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * TvUserA
 *
 * @author cy
 */
@Component
public class TvUserA implements ApplicationListener<SpringTv> {


    @Override
    public void onApplicationEvent(SpringTv event) {
        System.out.println(event.getTv());
        System.out.println("TvUserA看到电视剧情节改变哭了");
    }
}
