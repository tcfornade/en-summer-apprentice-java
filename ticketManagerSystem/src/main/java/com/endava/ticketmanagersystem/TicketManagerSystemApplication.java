package com.endava.ticketmanagersystem;

import com.endava.ticketmanagersystem.model.Account;
import com.endava.ticketmanagersystem.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TicketManagerSystemApplication {

    public static void main(String[] args) {
       SpringApplication.run(TicketManagerSystemApplication.class, args);
    }

}
