package com.markhaust.vkbot.notification.events;

import com.markhaust.vkbot.json.JSONHandler;
import com.markhaust.vkbot.notification.Event;

public class Unknown extends Event {
    public Unknown(String name) {
        super(name);
    }

    @Override
    public String exec(JSONHandler json) {
        System.out.println("Неизвестный запрос");
        return System.getenv("responseStringDefault");
    }
}
