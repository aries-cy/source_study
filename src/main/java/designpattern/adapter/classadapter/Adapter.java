package designpattern.adapter.classadapter;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
