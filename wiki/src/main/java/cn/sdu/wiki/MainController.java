package cn.sdu.wiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication //same as @Configeration,@CompenentScan,@EnableAutoConfiguration
public class MainController {

    public static void main(String[] args) throws Exception {
    	SpringApplication.run(MainController.class, args);
    }
    
}