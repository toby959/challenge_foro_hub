package com.toby959.models.dto;

import com.toby959.models.Course;
import com.toby959.models.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicUpdateData(

        @NotBlank
        String title,

        @NotBlank
        String message,

        @NotNull
        Status status,

        @NotBlank
        String author,

        @NotNull
        Course course
) {
}
