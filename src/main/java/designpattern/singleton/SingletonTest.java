package designpattern.singleton;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * TODO 描述
 *
 * @author cy
 */
public class SingletonTest {

    /**
     * 枚举单例模式测试
     */
    @Test
    public void enumTest() throws IOException, ClassNotFoundException {
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("instance")));
        oos.writeObject(instance);
        File file = new File("instance");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(newInstance.getData() == instance.getData());
    }

    /**
     *  反射破坏单例模式
     */
    @Test
    public void invokeTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //饿汉式单例模式获取单例对象
       /* HungrySingleton instance = HungrySingleton.getInstance();
        //反射获取单例对象
        Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();*/

        /*StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

        Class objectClass = StaticInnerClassSingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();*/

        LazySingleton instance = LazySingleton.getInstance();
        Field flag = instance.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance,true);

        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton newInstance = (LazySingleton) constructor.newInstance();


        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }

    /**
     * 序列化破坏单例模式
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    public void serializableTest() throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("instance")));
        oos.writeObject(instance);

        File file = new File("instance");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }

    @Test
    public void multiThreadTest(){
        Thread t1 = new Thread(new TestThread());
        Thread t2 = new Thread(new TestThread());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}
