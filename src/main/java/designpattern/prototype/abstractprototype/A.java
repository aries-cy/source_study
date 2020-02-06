package designpattern.prototype.abstractprototype;

/**
 * TODO 描述
 *
 * @author cy
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
