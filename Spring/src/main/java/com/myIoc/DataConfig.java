package com.myIoc;
/*
    自定义数据库链接
    1、需引入lombok
 */
import lombok.Data; //自动生成get/set/contructure/toString方法。（下载插件）


@Data
public class DataConfig {
    private String url;
    private String driverName;
    private String usrname;
    private String passwd;
}
