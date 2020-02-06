package designpattern.singleton;

import static java.lang.Thread.*;

/**
 * TODO 描述
 *
 * @author cy
 */
public class TestThread implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + lazySingleton);
    }
}
