package designpattern.adapter.objectadapter;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
