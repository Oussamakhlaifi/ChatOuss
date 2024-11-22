package com.StreamSphere.demo.WSController;

import lombok.*;

import java.awt.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private  String cintent;
    private String sender;
    private MessageType type;
}
