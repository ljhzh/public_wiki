package cn.sdu.wiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //same as @Configeration,@CompenentScan,@EnableAutoConfiguration
public class MainController {

    public static void main(String[] args) throws Exception {
    	SpringApplication.run(MainController.class, args);
    }
    
}