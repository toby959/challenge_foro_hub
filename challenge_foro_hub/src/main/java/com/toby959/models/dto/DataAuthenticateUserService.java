package com.toby959.models.dto;

import jakarta.validation.constraints.NotBlank;

public record DataAuthenticateUserService (
        @NotBlank(message = "Usuario requerido!!!")
        String login,

        @NotBlank(message = "Password requerido!!!")
        String password
){
}
