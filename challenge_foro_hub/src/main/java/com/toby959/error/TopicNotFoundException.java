package com.toby959.error;

public class TopicNotFoundException extends RuntimeException{
    public TopicNotFoundException(Long id) {
        super("Topico no encontrado con ID: " + id);
    }
}
