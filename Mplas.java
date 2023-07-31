package org.mplas.mplas;

import org.bukkit.plugin.java.JavaPlugin;
import org.mplas.mplas.Commands.Mplasplugin;
import org.mplas.mplas.Other.Events;

public final class Mplas extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getLogger().info("Плагин успешно загружен!");
        getServer().getPluginManager().registerEvents(new Events(this), this);
        getServer().getPluginCommand("mplas").setExecutor(new Mplasplugin());
    }
    @Override
    public void onDisable() {
        getServer().getLogger().info("Плагин резко прекратил свою работу!");
    }
}
