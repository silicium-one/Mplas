package org.mplas.mplas.Commands;

import net.kyori.adventure.text.Component;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import static org.mplas.mplas.Companents.StyleUtils.*;

import static net.kyori.adventure.text.format.NamedTextColor.GRAY;
import static net.kyori.adventure.text.format.NamedTextColor.GREEN;

public class Fly implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender.hasPermission("mplas.fly")) {
            if (sender instanceof Player player) {
                if (player.isFlying()) {
                    player.sendMessage(Component.text("Флай выключен").color(GREEN));
                    player.setAllowFlight(false);
                } else {
                    player.setAllowFlight(true);
                    player.sendMessage(Component.text("Флай включен").color(GREEN));
                }
            }
        }
        return true;
    }
}