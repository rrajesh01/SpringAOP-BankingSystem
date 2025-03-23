package com.rajesh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.rajesh.service.AccountService;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AccountService accountService = context.getBean("accountService", AccountService.class);

        accountService.withdraw(101, 500000);

        System.out.println("==========================");

        accountService.deposit(102, 45000);

        System.out.println("==========================");

        accountService.transfer(101, 102, 240000);

        context.close();
    }
}
