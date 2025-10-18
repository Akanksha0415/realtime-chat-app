/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.chatapp;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 *
 * @author Lenovo
 */
@Document(collection="messages")
public class Message {
    @Id
    private String id;
    private String content;
    private String sender;
    private LocalDateTime timestamp;
    
    public Message(){}
    
    public Message(String sender,String content){
        this.sender=sender;
        this.content=content;
        this.timestamp =LocalDateTime.now();
    }
    public Message(String sender,String content,LocalDateTime timestamp){
        this.sender =sender;
        this.content =content;
        this.timestamp=timestamp;
    }
    public String getId(){
        return id;
    }
    public String getSender(){
        return sender;
    }
    public void setSender(String sender){
        this.sender=sender;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }
    public LocalDateTime getTimestamp(){
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp){
        this.timestamp=timestamp;
    }
}
