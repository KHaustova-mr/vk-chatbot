package com.markhaust.vkbot.command.commands;

import com.markhaust.vkbot.command.Command;
import com.markhaust.vkbot.vk.VKManager;

public class Help extends Command {
    public Help(String name) {
        super(name);
    }

    @Override
    public void exec(int peerId, String message) {
        new VKManager().sendMessage("Установлена группа по умолчанию: ФИб-3301-51-00." +
                "\nЧтобы узнать расписание напиши \"расписание\" или \"пары\"." +
                "Чтобы узнать расписание другой группы напиши \"расписание\" или \"пары\" с указание абривиатуры группы.",
                peerId);
    }
}
