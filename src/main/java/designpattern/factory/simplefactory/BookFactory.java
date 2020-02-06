package designpattern.factory.simplefactory;

/**
 * 简单工厂方法
 *
 * @author cy
 */
public class BookFactory {

//    public Book getBook(String name){
//        if("java".equals(name)){
//            return new JavaBook();
//        }else if("python".equals(name)){
//            return new PythonBook();
//        }
//        return null;
//    }

    public Book getBook(Class c){
        Book book = null;
        try {
            book = (Book) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return book;
    }
}
