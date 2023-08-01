package org.mplas.mplas.Commands;

import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static net.kyori.adventure.text.format.NamedTextColor.GREEN;
import static org.mplas.mplas.Companents.StyleUtils.white;

public class Heal implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender.hasPermission("mplas.heal")) {
            if (sender instanceof Player player) {
                player.sendMessage(Component.text("Вы были вылечены").color(GREEN));
                player.setHealth(20);
                player.setFoodLevel(20);
                player.setFireTicks(0);
            }
        }
        return true;
    }
}
