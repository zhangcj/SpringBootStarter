package com.example.autocinfigure;

import com.example.properties.ExampleServiceProperties;
import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description
 * <p>
 * </p>
 * DATE 2017/8/11.
 *
 * @author zhangchunju.
 */
@Configuration
@ConditionalOnClass(ExampleService.class) // 当classpath 下发现该类的情况进行自动装配
@EnableConfigurationProperties(ExampleServiceProperties.class)
public class ExampleAutoConfigure {

    @Autowired
    private ExampleServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean // 当Spring Context中不存在该Bean时
    @ConditionalOnProperty(prefix = "example.service", value = "enable", havingValue = "true") // 当配置文件中example.service.enable=true时
    ExampleService exampleService() {
        return new ExampleService(properties.getPrefix(), properties.getSuffix());
    }
}
