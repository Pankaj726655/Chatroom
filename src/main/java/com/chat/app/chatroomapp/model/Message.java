package com.chat.app.chatroomapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private String name;
    private String content;
}
