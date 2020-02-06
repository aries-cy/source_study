package designpattern.factory.factorymethod;

/**
 * TODO 描述
 *
 * @author cy
 */
public class PythonBookFactory extends BookFactory {
    @Override
    public Book getBook() {
        return new PythonBook();
    }
}
