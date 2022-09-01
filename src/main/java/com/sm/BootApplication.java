package com.sm;

import com.sm.config.VaultConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BootApplication.class, args);
        VaultConfiguration vaultConfiguration = context.getBean(VaultConfiguration.class);
        System.out.println("UserName: " + vaultConfiguration.getUsername());
    }

}
