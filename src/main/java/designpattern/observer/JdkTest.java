package designpattern.observer;

import designpattern.observer.jdk.Movie;
import designpattern.observer.jdk.People;
import designpattern.observer.jdk.TvPlay;

/**
 * jdk观察者模式测试
 *
 * @author cy
 */
public class JdkTest {

    public static void main(String[] args) {
        Movie movie = new Movie();
        People she = new People("她");
        People me = new People("我");
        movie.addObserver(she);
        movie.addObserver(me);
        movie.setPlot("恋爱");
        movie.setPlot("结婚");
        System.out.println("--------------------");

        TvPlay tvPlay = new TvPlay();
        tvPlay.addObserver(she);
        tvPlay.addObserver(me);
        tvPlay.setPlot("哈哈哈哈");
        tvPlay.setPlot("哼唧");
    }
}
