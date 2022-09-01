package com.sm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VaultConfiguration {

    @Value("${username}")
    public String username;

    public String getUsername() {
        return username;
    }


}