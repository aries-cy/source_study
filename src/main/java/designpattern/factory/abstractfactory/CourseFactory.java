package designpattern.factory.abstractfactory;

/**
 * TODO 描述
 *
 * @author cy
 */
public interface  CourseFactory {

    /**
     * 书籍资料
     * @return 书籍
     */
    Book getBook();

    /**
     * 视频资料
     * @return 视频
     */
    Video getVideo();
}
