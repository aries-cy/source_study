package designpattern.factory.abstractfactory;

/**
 * TODO 描述
 *
 * @author cy
 */
public class PythonBook extends Book {
    @Override
    public void produce() {
        System.out.println("python书籍");
    }
}
