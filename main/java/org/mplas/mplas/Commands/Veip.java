package org.mplas.mplas.Commands;

import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import static net.kyori.adventure.text.format.NamedTextColor.*;

import static net.kyori.adventure.text.format.NamedTextColor.GREEN;
import static org.mplas.mplas.Companents.StyleUtils.*;

public class Veip implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        sender.sendMessage(openUrl(green("кликни на меня:)"),"https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        return true;
    }
}
