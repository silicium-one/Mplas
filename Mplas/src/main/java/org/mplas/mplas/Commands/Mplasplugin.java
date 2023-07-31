package org.mplas.mplas.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Mplasplugin implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] strings) {
        Player p = (Player) sender;
        if (!sender.hasPermission("mplas.main")){
            p.sendMessage(ChatColor.WHITE + "{Mplas}" + ChatColor.GREEN + "Этот плагин нужен для отображения последнего входа на сервер.В UUID.Информация о входах написана в конфиге.");
            p.sendMessage(ChatColor.WHITE + "{Mplas}" + ChatColor.GREEN + "Комманд в плагине нет!.");
            p.sendMessage(ChatColor.WHITE + "{Mplas}" + ChatColor.GRAY + "This is plugin by Xil0nchik.");
        }
        else {
            p.sendMessage(ChatColor.RED + "У нет вас есть права!");
        }
        return true;
    }
}
