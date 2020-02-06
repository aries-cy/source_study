package springsource.ioc.bean;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * TODO 描述
 *
 * @author cy
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //将monkey2 的BeanDefinition注册到容器中 getBean("monkey2")
//        registry.registerBeanDefinition("monkey2",new RootBeanDefinition(Monkey.class));


        BeanDefinition beanDefinition = new RootBeanDefinition(MyFactoryBean.class);
        registry.registerBeanDefinition("myFactoryBean",beanDefinition);

        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("springsource.ioc.bean.Lion");


    }
}
