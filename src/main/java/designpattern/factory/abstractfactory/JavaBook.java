package designpattern.factory.abstractfactory;


/**
 * TODO 描述
 *
 * @author cy
 */
public class JavaBook extends Book {
    @Override
    public void produce() {
        System.out.println("java书籍");
    }
}
