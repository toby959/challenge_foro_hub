package com.toby959.models.dto;

import com.toby959.models.Course;
import com.toby959.models.Status;
import com.toby959.models.Topic;

import java.time.LocalDateTime;

public record TopicDataDetails(
        String title,
        String message,
        LocalDateTime creationDate,
        Status status,
        String author,
        Course course
) {
    public TopicDataDetails(Topic topic) {
        this(topic.getTitle(), topic.getMessage(), topic.getCreationDate(),
                topic.getStatus(), topic.getAuthor(), topic.getCourse()
        );
    }
}
