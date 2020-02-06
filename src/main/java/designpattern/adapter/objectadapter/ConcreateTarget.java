package designpattern.adapter.objectadapter;


/**
 * TODO 描述
 *
 * @author cy
 */
public class ConcreateTarget implements Target {


    @Override
    public void request() {
        System.out.println("目标方法");
    }
}
