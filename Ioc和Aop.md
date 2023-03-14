# Ioc和Aop
IOC：(将需要的组件对象创建好 我们只需要使用就行)
    是Spring各个功能模块的基础，创建对象的容器。

AOP:以IOC为基础，AOP是面向切面编程（抽象化的面向对象）。很多方法的统一位置
    功能：
        1、打印日志
        2、事务
        3、权限处理
IOC：
    控制反转，将对象的创建进行反转。开发者不需要创建对象(交给Spring框架去创建)，由IOC容器根据需求自动创建项目所需要的对象。
    1、在Spring目录的pom.xml文件中引入依赖
    “”“
        <dependencies>
        <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.1.18.RELEASE</version>
        </dependency>
        </dependencies>
    ”“”
    2、IOC使用方式：
    基于XML（未学）和注解（注解使用多）
    1、基于配置类
    用一个jave类
    """
        @Configuration
        public class BeanConfiguration {
            @Bean("value = config)
            public DataConfig dataConfig(){
                DataConfig dataConfig = new DataConfig();
                dataConfig.setUrl("localhost:3306/db");
                dataConfig.setDriverName("Driver");
                dataConfig.setUsrname("root");
                dataConfig.setPasswd("root");
            }
        }
    """
    2、扫包+注解
    







    lombok：
        帮助我们的类自动生成get/set/contructure/toString方法。
