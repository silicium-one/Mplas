package org.mplas.mplas.Commands;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static net.kyori.adventure.text.format.NamedTextColor.GREEN;
import static org.mplas.mplas.Companents.StyleUtils.white;

public class Bolt implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender.hasPermission("mplas.bolt")) {
            if (sender instanceof Player player) {
                Player x = Bukkit.getPlayer(args[0]);
                if (x != null) {
                    player.sendMessage(Component.text("Вы ударили молнией").color(GREEN));
                    World w = x.getWorld();
                    w.strikeLightning(x.getLocation());
                }else {
                    player.sendMessage(Component.text("Игрок не онлайн").color(GREEN));
                    return false;
                }
            }
        }
        return true;
    }
}
