package designpattern.singleton;

/**
 * TODO 描述
 *
 * @author cy
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private static boolean flag = true;

    private LazySingleton(){
        //反射如果先进来，依然会有两个对象
        if(flag){
            flag = false;
        }else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getInstance() {
        if(lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


}
