package com.myIoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean("value = dataConfig")
    public DataConfig dataConfig(){
        DataConfig dataConfig = new DataConfig();
        dataConfig.setUrl("localhost:3306/db");
        dataConfig.setDriverName("Driver");
        dataConfig.setUsrname("root");
        dataConfig.setPasswd("root");
        return dataConfig;
    }
}
