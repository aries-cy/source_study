package designpattern.build.v1;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse( String courseName,
             String courseVideo,
             String coursePpt,
             String courseBook){
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCoursePpt(coursePpt);
        this.courseBuilder.buildCourseBook(courseBook);
        return this.courseBuilder.makeCourse();
    }
}
