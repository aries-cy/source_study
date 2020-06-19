package designpattern.observer.jdk;

import java.util.Observable;

/**
 * 电视剧（被观察者）
 *
 * @author cy
 */
public class TvPlay extends Observable {

    private String plot;

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
        setChanged();
        notifyObservers();
    }
}
