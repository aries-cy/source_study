package designpattern.adapter.objectadapter;



/**
 * TODO 描述
 *
 * @author cy
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreateTarget();
        target.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
