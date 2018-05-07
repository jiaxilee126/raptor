package com.ppdai.framework.raptor.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yinzuolong
 */
@EnableAspectJAutoProxy(proxyTargetClass = false)
@Configuration
public class AspectConfig {

    @Bean
    public AspectHandler1 createAspectHandler1() {
        return new AspectHandler1();
    }

    @Bean
    public AspectHandler2 createAspectHandler2() {
        return new AspectHandler2();
    }
}
