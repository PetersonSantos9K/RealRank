package com.peterson.realrankapi.services.mapper;

import com.peterson.realrankapi.dto.request.UserRequestDTO;
import com.peterson.realrankapi.dto.response.UserResponseDTO;
import com.peterson.realrankapi.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRequestDTO userRequestDTO);
    UserResponseDTO toResponseDTO(User user);
}
