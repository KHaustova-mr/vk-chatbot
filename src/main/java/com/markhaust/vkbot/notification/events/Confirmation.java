package com.markhaust.vkbot.notification.events;

import com.markhaust.vkbot.json.JSONHandler;
import com.markhaust.vkbot.notification.Event;

public class Confirmation extends Event {

    public Confirmation(String name) {
        super(name);
    }

    @Override
    public String exec(JSONHandler json) {
        return System.getenv("responseString");
    }
}
