package designpattern.observer.spring.tv;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * TvUserB
 *
 * @author cy
 */
@Component
public class TvUserB implements ApplicationListener<SpringTv> {


    @Override
    public void onApplicationEvent(SpringTv event) {
        System.out.println("TvUserB看到电视剧情节改变笑了");
    }
}
