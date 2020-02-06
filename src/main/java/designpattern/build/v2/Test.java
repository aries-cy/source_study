package designpattern.build.v2;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java课程")
                .buildCoursePpt("java PPT")
                .buildCourseVideo("java视频")
                .buildCourseBook("java书籍")
                .build();
        System.out.println(course.toString());
    }
}
