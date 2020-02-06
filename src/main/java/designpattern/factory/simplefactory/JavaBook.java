package designpattern.factory.simplefactory;

/**
 * TODO 描述
 *
 * @author cy
 */
public class JavaBook extends Book {
    @Override
    public void produce() {
        System.out.printf("java书籍");
    }
}
