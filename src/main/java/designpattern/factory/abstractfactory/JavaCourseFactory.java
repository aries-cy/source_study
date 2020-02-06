package designpattern.factory.abstractfactory;

/**
 * TODO 描述
 *
 * @author cy
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Book getBook() {
        return new JavaBook();
    }

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
