package designpattern.singleton;

/**
 * 静态内部类的单例模式
 *
 * @author cy
 */
public class StaticInnerClassSingleton {

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton(){
        //防止反射调用
        if(InnerClass.staticInnerClassSingleton!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
}
