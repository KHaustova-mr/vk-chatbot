package com.markhaust.vkbot.command;

import java.util.Collection;

public class CommandDeterminate {
    public static Command getCommand(Collection<Command> commands, String nameCommand) {
        for (Command command : commands) {
            if (command.equals(nameCommand))
                return command;
        }
        return null;
    }
    public static String StringToCommandString(String str){
        switch(str){
            case "помощь":
            case "что ты умеешь":
                return "help";
            case "расписание":
            case "пары":
                return "schedule";
            default:
                return null;
        }
    }
}
