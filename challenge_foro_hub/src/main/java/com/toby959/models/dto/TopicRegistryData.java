package com.toby959.models.dto;

import com.toby959.models.Course;
import com.toby959.models.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record TopicRegistryData(

        @NotBlank(message = "El título no debe estar vacío.")
        String title,

        @NotBlank(message = "El mensaje no debe estar vacío.")
        String message,

        @NotNull
        Status status,

        @NotBlank(message = "El autor no debe estar vacío.")
        String author,

        @NotNull
        Course course

) {

    public LocalDateTime creation_date() {
        return LocalDateTime.now();
    }

}
