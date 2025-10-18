/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.chatapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.chatapp.Message;
import com.example.chatapp.repository.MessageRepository;
import java.util.List;
/**
 *
 * @author Lenovo
 */
@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins="*")
public class MessageController {
    
    @Autowired
     private MessageRepository messageRepository;
    //savee msg
    @PostMapping("/send")
    public Message sendMessage(@RequestBody Message message){
        return messageRepository.save(message);
        
    }
    //get all msg
    @GetMapping("/all")
    public List<Message> getAllMessages(){
        return messageRepository.findAll();
        
    }
    //test endpoint
    @GetMapping("/test")
    public String testConnection() {
        return "Hello, MongoDB connected!";
    }

    
}
