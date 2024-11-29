package com.toby959.repository;

import com.toby959.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    boolean existsByTitleAndMessage(String title, String message);
}
