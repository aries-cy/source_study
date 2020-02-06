package designpattern.factory.factorymethod;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Test {

    public static void main(String[] args) {
        BookFactory factory = new JavaBookFactory();
        Book book = factory.getBook();
        book.produce();
    }
}
