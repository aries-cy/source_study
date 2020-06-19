package designpattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 人（观察者）
 *
 * @author cy
 */
public class People implements Observer {

    private String name;
    private String behavior;

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Movie){
            Movie movie = (Movie) o;
            System.out.println(name+"看到电影情节"+movie.getPlot());
        }else if(o instanceof TvPlay){
            TvPlay tvPlay = (TvPlay) o;
            System.out.println(name+"看到电视剧情节"+tvPlay.getPlot());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public People(String name){
        this.name = name;
    }


}
