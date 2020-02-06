package springsource.ioc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springsource.ioc.bean.MapperScan;
import springsource.ioc.bean.MyImportBeanDefinitionRegistrar;

/**
 * TODO 描述
 *
 * @author cy
 */
@Configuration
@ComponentScan("springsource.ioc.bean")
@MapperScan
public class AppConfig {
}
