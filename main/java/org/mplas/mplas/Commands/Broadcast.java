package org.mplas.mplas.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Broadcast implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
        if (sender.hasPermission("mplas.broadcast")) {
            if (args.length!=0) {
                String message = "";
                for (int i = 0; i < args.length; i++) {
                    message = String.valueOf(message)+args[i]+"";
                }
                message = ChatColor.translateAlternateColorCodes('&', message);
                Bukkit.broadcastMessage("§7[§a"+sender.getName()+"§7] " + message);
            } else {
                sender.sendMessage("§fИспользуйте /broadcast <сообщение>");
            }

        } else  {
            sender.sendMessage(ChatColor.RED + "У вас нет прав!");
        }
        return true;
    }
}
