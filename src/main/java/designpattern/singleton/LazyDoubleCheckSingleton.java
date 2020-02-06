package designpattern.singleton;

/**
 * 双重检查+volatile的单例模式
 *
 * @author cy
 */
public class LazyDoubleCheckSingleton {

    /**
     * volatile:不允许重排序出现
     */
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance() {
        if(lazySingleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazySingleton==null){
                    lazySingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存；2.初始化对象；3.设置lazySingleton 指向刚分配的内存地址
                    //上面3步可能被重排序 ，当2和3交换时，可能存在lazySingleton不为 null ,但是对象还没有初始化完成
                }
            }
        }
        return lazySingleton;
    }
}
