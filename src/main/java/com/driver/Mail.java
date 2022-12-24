package com.driver;

import java.util.Date;

public class Mail {

    public Date date;
    public String messageData;
    public String senderId;

    public Mail(Date date, String senderId, String messageData) {
        this.date = date;
        this.senderId = senderId;
        this.messageData = messageData;
    }
}
