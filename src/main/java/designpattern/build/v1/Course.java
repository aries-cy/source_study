package designpattern.build.v1;

import lombok.Data;

/**
 * TODO 描述
 *
 * @author cy
 */
@Data
public class Course {

    private String courseName;
    private String courseVideo;
    private String coursePpt;
    private String courseBook;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", coursePpt='" + coursePpt + '\'' +
                ", courseBook='" + courseBook + '\'' +
                '}';
    }
}