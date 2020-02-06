package springsource.ioc;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import springsource.ioc.bean.Fox;
import springsource.ioc.bean.Monkey;
import springsource.ioc.bean.User;
import springsource.ioc.config.AppConfig;
import springsource.ioc.datasource.MapperConfig;
import springsource.ioc.datasource.mapper.TestMapper;
import springsource.ioc.datasource.mapper.UserMapper;

/**
 * TODO 描述
 *
 * @author cy
 */
public class IocTest {

    @Test
    public void datasourceTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MapperConfig.class);
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        userMapper.queryUsers();

        TestMapper testMapper = (TestMapper) context.getBean("testMapper");
        testMapper.test();
    }

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //抛NoSuchBeanDefinitionException异常--->AppConfig配置扫描@ComponentScan("springsource.ioc.bean")
        context.getBean(User.class);
        //TODO 思考 BeanDefinition 到底是什么？看源码 BeanDefinition 类
//        context.getBean(Fox.class);
        //----->BeanDefinition 是一个bean定义（承载bean的属性：scope、className、init-method等）
        //bean:交给ioc容器管理的对象

//        context.getBean("fox");
        // TODO BeanDefinitionRegistry------>bean 定义注册器  看源码
        // 注册bean： registerBeanDefinition(String beanName, BeanDefinition beanDefinition)
        //context.getBeanDefinitionNames() 可以看到容器中的bean
        BeanDefinition definition = context.getBeanDefinition("user");


        //TODO 怎么将Fox交给Spring容器去管理（bean注册原理）：将fox作为key，beanDefinition作为value，放入到beanDefinitionMap中（ConcurrentHashMap）
        BeanDefinition beanDefinition = new RootBeanDefinition(Fox.class);
        context.registerBeanDefinition("fox",beanDefinition);
//        context.register(Fox.class);   ---->和上面一样的效果
//        System.out.println(context.getBean("fox"));
        // beanDefinition 可以填充属性  普通属性
        beanDefinition.getPropertyValues().add("name","fox");
        beanDefinition.getPropertyValues().add("age",20);
        //设置注入方式：3:构造器贪婪模式-->选择参数多的构造器； (1/2 用setter方法注入)2：byType;   1:byName(方法名必须是规范的，否则注册不了)
        ((RootBeanDefinition)beanDefinition).setAutowireMode(1);
        System.out.println(context.getBean("fox"));

        //TODO 思考：不注册 beanDefinition ，能不能将对象交给Spring容器去管理
        Monkey monkey = new Monkey();
        DefaultListableBeanFactory defaultListableBeanFactory = context.getDefaultListableBeanFactory();
        //将对象缓存到单例池中 :singletonObjects  也是一个ConcurrentHashMap
        //将普通的对象变成一个bean
        defaultListableBeanFactory.registerSingleton("monkey",monkey);
        System.out.println(context.getBean("monkey"));;

//        System.out.println(context.getBean("monkey2"));

        //TODO FactoryBean  getBean()  返回一个代理对象  MapperFactoryBean  （可以拿来做中间件）
        // FactoryBean可以作为一个普通的bean，也可以作为一个特殊的bean（返回任意类的对象）
        //输出--->springsource.ioc.bean.Ant@537f60bf
        System.out.println(context.getBean("myFactoryBean"));
        //输出--->springsource.ioc.bean.MyFactoryBean@5677323c
        System.out.println(context.getBean("&myFactoryBean"));

    }
}
