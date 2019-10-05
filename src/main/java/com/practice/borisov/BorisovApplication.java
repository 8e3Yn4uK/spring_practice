package com.practice.borisov;

import com.practice.borisov.quoters.Quoter;
import com.practice.borisov.quoters.TerminatorQuoter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BorisovApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(BorisovApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        while (true) {
            Thread.sleep(1000);
            context.getBean(Quoter.class).sayQuote();
        }
    }

}
