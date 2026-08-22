package com.peterson.realrankapi.dto.response;

import java.util.UUID;

public record UserResponseDTO(
        UUID id,
        String username,
        String email
) {
}
