package com.peterson.realrankapi.config;

import com.peterson.realrankapi.entities.User;
import com.peterson.realrankapi.repositories.UserRepository;
import com.peterson.realrankapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.UUID;

@Configuration
@Profile("test")
@RequiredArgsConstructor
public class InstantiationTestConfig implements CommandLineRunner{

    private final UserRepository userRepository;
    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {
        User a = new User(null, "user1", "user1@gmail.com", "123456");
        userRepository.save(a);



        IO.println(userService.findById(a.getId()).username());

       // (UUID id, String username, String email, String passwordHash)

    }

}
