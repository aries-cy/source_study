package springsource.ioc.datasource;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * TODO 描述
 *
 * @author cy
 */
public class MyMapperFactoryBean implements FactoryBean  {

    private Class interfaceClass;

    public MyMapperFactoryBean(Class interfaceClass){
        this.interfaceClass = interfaceClass;
    }

    @Override
    public Object getObject() throws Exception {
        return Proxy.newProxyInstance(getClass().getClassLoader(),new Class[]{interfaceClass},new MyInvocationHandler());
    }

    @Override
    public Class<?> getObjectType() {
        return interfaceClass;
    }
}
