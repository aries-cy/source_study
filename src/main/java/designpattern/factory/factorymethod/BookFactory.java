package designpattern.factory.factorymethod;

/**
 * 工厂方法
 *
 * @author cy
 */
public abstract class BookFactory {

    /**
     * 获取书籍
     * @return 书籍
     */
    public abstract Book getBook();
}
