package designpattern.build.v1;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(builder);
        Course course = coach.makeCourse("java课程",
                "java视频",
                "java PPT",
                "java书籍");
        System.out.println(course.toString());
    }
}
