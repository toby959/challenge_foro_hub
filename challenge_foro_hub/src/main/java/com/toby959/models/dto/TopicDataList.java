package com.toby959.models.dto;

import com.toby959.models.Course;
import com.toby959.models.Status;
import com.toby959.models.Topic;

import java.time.LocalDateTime;

public record TopicDataList(
        Long id,
        String title,
        String message,
        LocalDateTime creationDate,
        Status status,
        String author,
        Course course
) {
    public TopicDataList(Topic topic) {
        this(topic.getId(), topic.getTitle(), topic.getMessage(),
                topic.getCreationDate(), topic.getStatus(),
                topic.getAuthor(), topic.getCourse());
    }
}
