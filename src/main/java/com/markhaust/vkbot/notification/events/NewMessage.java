package com.markhaust.vkbot.notification.events;

import com.markhaust.vkbot.command.Commander;
import com.markhaust.vkbot.json.JSONHandler;
import com.markhaust.vkbot.notification.Event;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewMessage extends Event {
    public NewMessage(String name) {
        super(name);
    }

    @Override
    public String exec(JSONHandler json) {
        int peerId = json.getVkObject().getJSONObject("message").getInt("peer_id");
        String msg = json.getVkObject().getJSONObject("message").getString("text");
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Commander(msg,peerId));
        return System.getenv("responseStringDefault");
    }
}
