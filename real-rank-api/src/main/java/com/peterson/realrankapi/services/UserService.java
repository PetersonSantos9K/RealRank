package com.peterson.realrankapi.services;


import com.peterson.realrankapi.dto.response.UserResponseDTO;
import com.peterson.realrankapi.entities.User;
import com.peterson.realrankapi.repositories.UserRepository;
import com.peterson.realrankapi.services.exceptions.ResourceNotFoundException;
import com.peterson.realrankapi.services.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponseDTO findById(UUID id){
        User obj = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
        return userMapper.toResponseDTO(obj);
    }
}
