package designpattern.build.v2;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Course {

    private String courseName;
    private String courseVideo;
    private String coursePpt;
    private String courseBook;

    public Course(CourseBuilder builder) {
        this.courseName = builder.courseName;
        this.courseBook = builder.courseBook;
        this.coursePpt = builder.coursePpt;
        this.courseVideo = builder.courseVideo;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", coursePpt='" + coursePpt + '\'' +
                ", courseBook='" + courseBook + '\'' +
                '}';
    }

    public static class CourseBuilder{

        private String courseName;
        private String courseVideo;
        private String coursePpt;
        private String courseBook;

        public CourseBuilder buildCourseName(String courseName){
            System.out.println(courseName);
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo){
            System.out.println(courseVideo);
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCoursePpt(String coursePpt){
            System.out.println(coursePpt);
            this.coursePpt = coursePpt;
            return this;
        }

        public CourseBuilder buildCourseBook(String courseBook){
            System.out.println(courseBook);
            this.courseBook = courseBook;
            return this;
        }

        public Course build(){
            return new Course(this);
        }

    }
}
