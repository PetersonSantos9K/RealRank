package com.peterson.realrankapi.config;

import com.peterson.realrankapi.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
@RequiredArgsConstructor
public class InstantiationTestConfig implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        User a = new User();




    }

}
