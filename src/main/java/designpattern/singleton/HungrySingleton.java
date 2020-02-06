package designpattern.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 *
 * @author cy
 */
public class HungrySingleton implements Serializable ,Cloneable{

    private final static HungrySingleton hungrySingleton ;

    static {
        hungrySingleton = new HungrySingleton();
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private HungrySingleton(){
        //防止反射调用
        if(null!=hungrySingleton){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 在readObject()方法中，会判断是否有该方法，反射调用这个方法，返回hungrySingleton，保证返回同一个对象
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
