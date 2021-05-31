package com.kinandcarta.springaop;

import com.kinandcarta.springaop.business.Business1;
import com.kinandcarta.springaop.business.Business2;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {


    @Autowired
    private Business1 business1;

    @Autowired
    private Business2 business2;

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(business1.calculateSomething());
        System.out.println(business2.calculateSomething());

    }
}
