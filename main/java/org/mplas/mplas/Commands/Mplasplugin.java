package org.mplas.mplas.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.TabCompleteEvent;
import org.jetbrains.annotations.NotNull;
import org.mplas.mplas.Mplas;

import static java.awt.Color.green;
import static org.mplas.mplas.Companents.StyleUtils.*;

public class Mplasplugin implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] args) {
        Player p = (Player) sender;
        if (args.length == 0) {
            if (sender.hasPermission("mplas.help")) {
                p.sendMessage(green("/mplas reload"));
                p.sendMessage(green("/broadcast" + " сообщение"));
                p.sendMessage(green("/gm ", gray("0|1|2|3")));
                p.sendMessage(green("/fly"));
                p.sendMessage(green("/heal"));
                p.sendMessage(green("/bolt"));
            } else {
                sender.sendMessage(red("У вас нет прав!"));
            }
            return true;
        }
        if (args[0].equals("reload")) {
            if (sender.hasPermission("mplas.reload")) {
                p.sendMessage(green("Плагин успешно перезапущен!"));

                Mplas.getInstance().reloadConfig();
            } else {
                sender.sendMessage(red("У вас нет прав!"));
            }
        }
        return true;
    }
    @EventHandler
    public void onPlayerUseTab(TabCompleteEvent e) {
        if (!e.getSender().hasPermission("mplas.admin") || !e.getSender().isOp()) {
            e.setCancelled(true);
        }
    }
}
