package org.mplas.mplas.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import static org.mplas.mplas.Companents.StyleUtils.*;

public class Getop implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        sender.sendMessage(openUrl(green("кликни на меня:)"),"https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        return true;
    }
}
