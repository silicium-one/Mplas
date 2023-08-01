package org.mplas.mplas;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.mplas.mplas.Commands.*;
import org.mplas.mplas.Other.Events;
import static org.mplas.mplas.Companents.StyleUtils.*;

public final class Mplas extends JavaPlugin {


    @Override
    public void onEnable() {
        getLogger().info("Я включился");
        getServer().getPluginManager().registerEvents(new Events(this), this);
        getServer().getPluginCommand("bolt").setExecutor(new Bolt());
        getServer().getPluginCommand("broadcast").setExecutor(new Broadcast());
        getServer().getPluginCommand("fly").setExecutor(new Fly());
        getServer().getPluginCommand("gm").setExecutor(new Gamemodes());
        getServer().getPluginCommand("heal").setExecutor(new Heal());
        getServer().getPluginCommand("mplas").setExecutor(new Mplasplugin());
        getServer().getPluginCommand("veip").setExecutor(new Veip());
    }
    @Override
    public void onDisable() {
        getLogger().info("Я выключаюсь");
    }

    public static @NotNull Mplas
    getInstance() {
        return getPlugin(Mplas.class);
    }

}
