package springsource.ioc.datasource;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * TODO 描述
 *
 * @author cy
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(MapperImportBeanDefinitionRegistrar.class)
public @interface MyMapperScan {

    String[] value() default {};

}
