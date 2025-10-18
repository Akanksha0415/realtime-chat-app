package com.example.chatapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.chatapp.Message;

public interface MessageRepository extends MongoRepository<Message, String> {
}
