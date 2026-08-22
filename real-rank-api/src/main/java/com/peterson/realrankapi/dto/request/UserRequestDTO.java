package com.peterson.realrankapi.dto.request;

public record UserRequestDTO(
        String username,
        String email,
        String passwordHash
) {
}
