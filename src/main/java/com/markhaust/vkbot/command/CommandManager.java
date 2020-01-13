package com.markhaust.vkbot.command;

import com.markhaust.vkbot.command.commands.Help;
import com.markhaust.vkbot.command.commands.Schedule;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommandManager {
    private static List<String> commandsList = new ArrayList<>();
    static {
        commandsList.add("help");
        commandsList.add("schedule");
    }

    public static List<String> getCommandsList() { return commandsList; }

    public static HashSet<Command> getCommands(){
        HashSet<Command> commands = new HashSet<>();
        commands.add(new Help("help"));
        commands.add(new Schedule("schedule"));
        return commands;
    }
}
