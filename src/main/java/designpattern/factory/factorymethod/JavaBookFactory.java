package designpattern.factory.factorymethod;

/**
 * TODO 描述
 *
 * @author cy
 */
public class JavaBookFactory extends BookFactory {
    @Override
    public Book getBook() {
        return new JavaBook();
    }
}
