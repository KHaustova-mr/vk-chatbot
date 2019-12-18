package com.markhaust.vkbot.parse;

import com.markhaust.vkbot.string.ChangeString;

public class MessageParser {
    public static String ParseMessage(String message){
        message = ChangeString.RemoveSign(message);
        switch(message.toLowerCase()){
            case"привет":
                return "привет";
            case"как дела":
            case"как курсач":
                return "отлично";
            default:
                return"не знаю как отвечать на такие сообщения";
        }
    }
}
