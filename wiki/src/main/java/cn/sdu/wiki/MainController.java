package cn.sdu.wiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //配置控制
@EnableAutoConfiguration //启动自动配置
@ComponentScan //组件扫描
public class MainController {

    public static void main(String[] args) throws Exception {
    	SpringApplication.run(MainController.class,args);
    }
    
}