package designpattern.factory.simplefactory;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Test extends PythonBook {

    public static void main(String[] args) {
        BookFactory factory = new BookFactory();
        Book book = factory.getBook(JavaBook.class);
        book.produce();
    }
}
