package springsource.ioc.datasource;


import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO 描述
 *
 * @author cy
 */
public class MapperImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar , ResourceLoaderAware {

    private static final String value = "value";
    private ResourceLoader resourceLoader;

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(
                importingClassMetadata.getAnnotationAttributes(MyMapperScan.class.getName()));
        if(null!=annotationAttributes){
            for(String path : getScanPath(annotationAttributes)){
                BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(MyMapperFactoryBean.class);
                AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
                beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(path);
                registry.registerBeanDefinition(lowerFirst(path.substring(path.lastIndexOf(".")+1)),beanDefinition);
            }
        }
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    private List<String> getScanPath(AnnotationAttributes annotationAttributes){
        List<String> scanPath = new ArrayList<>();
        for(String basePackage:annotationAttributes.getStringArray(value)){
            ResourcePatternResolver resolver = ResourcePatternUtils.getResourcePatternResolver(resourceLoader);
            MetadataReaderFactory readerFactory = new CachingMetadataReaderFactory(resolver);
            try {
                Resource[] resources = resolver.getResources("classpath*:" + basePackage.replace('.', '/') + "/**/*.class");
                for(Resource resource:resources){
                    MetadataReader metadataReader = readerFactory.getMetadataReader(resource);
                    scanPath.add(metadataReader.getClassMetadata().getClassName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return scanPath;
    }

    private String lowerFirst(String oldStr){
        char[] charArray = oldStr.toCharArray();
        charArray[0] += 32;
        return String.valueOf(charArray);
    }
}
