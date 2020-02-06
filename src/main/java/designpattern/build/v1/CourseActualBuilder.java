package designpattern.build.v1;

/**
 * TODO 描述
 *
 * @author cy
 */
public class CourseActualBuilder extends CourseBuilder {

    Course course = new Course();
    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCoursePpt(String coursePpt) {
        course.setCoursePpt(coursePpt);
    }

    @Override
    public void buildCourseBook(String courseBook) {
        course.setCourseBook(courseBook);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
