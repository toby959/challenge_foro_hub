package com.toby959.models.dto;

import jakarta.validation.constraints.NotBlank;

public record DataAuthenticationUserService(
        @NotBlank
        String login,
        @NotBlank
        String password
) {
}
