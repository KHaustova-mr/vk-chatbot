package com.markhaust.vkbot.parse;


public class MessageParser {
    public static String ParseMessage(String message){

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
