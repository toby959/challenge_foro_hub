package com.toby959.models;


import com.toby959.models.dto.TopicRegistryData;
import com.toby959.models.dto.TopicUpdateData;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "topics")
@Entity(name = "Topic")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Schema(description = "Título del recurso", example = "Mortal Kombat X")
    private String title;


    @NotBlank
    @Schema(description = "Mensaje asociado al recurso", example = "Or I'll Soak These Sands With Your Blood!")
    private String message;


    @Schema(description = "Fecha de creación del recurso", example = "2024-11-27T22:18:07")
    private LocalDateTime creationDate;

    @Enumerated(EnumType.STRING)
    @Schema(description = "Estado del recurso", allowableValues = {"ACTIVE", "INACTIVE", "PENDING"}, example = "ACTIVE")
    private Status status;

    @NotBlank
    @Schema(description = "Autor del recurso", example = "SUB-ZERO")
    private String author;

    @Enumerated(EnumType.STRING)
    @Schema(description = "Curso relacionado con el recurso", example = "BRUTALITY")
    private Course course;

    public Topic(TopicRegistryData topicRegistryData) {
        this.title = topicRegistryData.title();
        this.message = topicRegistryData.message();
        this.creationDate = topicRegistryData.creation_date();
        this.status = topicRegistryData.status();
        this.author = topicRegistryData.author();
        this.course = topicRegistryData.course();
    }

    public void updateData(TopicUpdateData topicUpdateData) {
        this.title = topicUpdateData.title();
        this.message = topicUpdateData.message();
        this.status = topicUpdateData.status();
        this.author = topicUpdateData.author();
        this.course = topicUpdateData.course();
    }
}
