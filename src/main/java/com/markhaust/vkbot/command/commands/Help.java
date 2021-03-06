package com.markhaust.vkbot.command.commands;

import com.markhaust.vkbot.command.Command;
import com.markhaust.vkbot.vk.VKManager;

public class Help extends Command {
    public Help(String name) {
        super(name);
    }

    @Override
    public void exec(int peerId, String message) {
        new VKManager().sendMessage("" +
                        "Показывать погоду: команда weather\n" +
                        "Спроси: Какая сегодня погода?\n\n" +
                        "Могу отправить случайное изображение: команда image [запрос]\n" +
                        "Напиши изображение или картинка и после этого запрос\n\n" +
                        "А так же отвечать на некоторые сообщения, напиши и узнаешь)",
                peerId);
    }
}
