package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean({"mother","info"})
    public Mother getMotherInfo(Father getFatherInfo, Child getChildInfo) {
        return new Mother(getFatherInfo, getChildInfo);
    }

    @Bean
    public Father getFatherInfo(){
        return new Father();
    }

    @Bean
    public Child getChildInfo(){
        return new Child();
    }
}
