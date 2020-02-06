package designpattern.factory.simplefactory;

/**
 * TODO 描述
 *
 * @author cy
 */
public class PythonBook extends Book {
    @Override
    public void produce() {
        System.out.printf("python书籍");
    }
}
