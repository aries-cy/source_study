package designpattern.build.v1;

/**
 * TODO 描述
 *
 * @author cy
 */
public abstract class CourseBuilder {

//    private String courseName;
//    private String courseVideo;
//    private String coursePpt;
//    private String courseBook;

    public abstract void buildCourseName(String courseName);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCoursePpt(String coursePpt);
    public abstract void buildCourseBook(String courseBook);

    public abstract Course makeCourse();
}
