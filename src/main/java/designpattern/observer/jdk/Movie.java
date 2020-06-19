package designpattern.observer.jdk;


import java.util.Observable;

/**
 * 电影（被观察者）
 * 被观察者持有观察者，当被观察者发生变化时，方便通知所有的观察者：父类 Vector<Observer> obs;
 *
 * @author cy
 */
public class Movie extends Observable {

    /**
     * 电影情节
     */
    private String plot;

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
        /**
         * 电影情节 发生改变
         */
        setChanged();
        /**
         * 通知观察者
         */
        notifyObservers();
    }
}
