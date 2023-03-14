package com.myIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] arg){
//        DataConfig dataConfig = new DataConfig();
//        dataConfig.setUrl("localhost:3306/db");
//        dataConfig.setDriverName("Driver");
//        dataConfig.setUsrname("root");
//        dataConfig.setPasswd("root");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);//可以指定包名将包下所有配置类传进来
        System.out.println(context.getBean(DataConfig.class));
    }
}
