package designpattern.factory.abstractfactory;

/**
 * TODO 描述
 *
 * @author cy
 */
public class PythonCourseFactory implements CourseFactory{
    @Override
    public Book getBook() {
        return new PythonBook();
    }

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
