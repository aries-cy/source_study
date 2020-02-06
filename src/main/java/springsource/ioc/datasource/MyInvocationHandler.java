package springsource.ioc.datasource;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * TODO 描述
 *
 * @author cy
 */
public class MyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String sql = method.getDeclaredAnnotation(Select.class).value()[0];
        System.out.println(sql);
        return null;
    }
}
