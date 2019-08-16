package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 用来标注一个主程序类，说明这是一个spring boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {//简写psvm即可,点击main 函数，选择左边的运行，即可运行，不需要安装tomcat
        SpringApplication.run(HelloWorldMainApplication.class,args);//运行主程序
    }
}
