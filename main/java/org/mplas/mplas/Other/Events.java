package org.mplas.mplas.Other;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.TabCompleteEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.mplas.mplas.Mplas;

import java.time.LocalDateTime;

import static org.mplas.mplas.Companents.StyleUtils.*;

public class Events implements Listener{
    private final JavaPlugin plugin;

    public Events(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void handlejoinEvent(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        String nick = player.getName().toString();
        e.joinMessage(green("→ ", yellow(nick, white(" Неожиданно ворвался на сервер!"))));
        String uuid = player.getUniqueId().toString();
        String path = String.join(".", "usersjoin", uuid, "lastjoin");
        LocalDateTime currentTime = LocalDateTime.now();
        plugin.getConfig().set(path, currentTime.toString());
        plugin.saveConfig();
    }

    @EventHandler
    public void handlequitEvent(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        String nick = player.getName().toString();
        e.quitMessage(red("← ", yellow(nick, white(" Провалился в реальность!"))));
        String uuid = player.getUniqueId().toString();
        String path = String.join(".", "usersquit", uuid, "lastquit");
        LocalDateTime currentTime = LocalDateTime.now();
        plugin.getConfig().set(path, currentTime.toString());
        plugin.saveConfig();
    }
}
