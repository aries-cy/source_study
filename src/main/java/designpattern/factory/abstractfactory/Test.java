package designpattern.factory.abstractfactory;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        Book book = courseFactory.getBook();
        Video video = courseFactory.getVideo();
        book.produce();
        video.produce();
    }
}
