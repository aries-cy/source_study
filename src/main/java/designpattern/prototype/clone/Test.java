package designpattern.prototype.clone;

import designpattern.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Test {

    @org.junit.jupiter.api.Test
    public void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneSingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneSingleton);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig1 = new Pig("佩琦",date);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(66666666666L);
        System.out.println(pig1);
        System.out.println(pig2);

    }
}
