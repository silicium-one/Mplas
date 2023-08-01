package org.mplas.mplas.Commands;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import static org.mplas.mplas.Companents.StyleUtils.*;

import static net.kyori.adventure.text.format.NamedTextColor.GRAY;
import static net.kyori.adventure.text.format.NamedTextColor.*;

public class Gamemodes implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 0) { // если лист пустой
            sender.sendMessage(gray("Использование комманды: ", green("/gm 0|1|2|3")));

            return false;
        }
        if (sender.hasPermission("mplas.gamemode")) {
        }// проверка на то, имеет ли отправитель команды разрешений
        GameMode gm = switch (args[0]) { // 0 - самая первая строка из списка, первый аргумент
            case "1", "creative" -> GameMode.CREATIVE; // если первый аргумент это 1 или creative, то режим игры будет CREATIVE
            case "0", "survival" -> GameMode.SURVIVAL; // ну и так далее
            case "3", "spectator" -> GameMode.SPECTATOR; //spectator
            case "2", "adventure" -> GameMode.ADVENTURE; //spectator
            default -> GameMode.SURVIVAL;//TODO Если ничего не подходит, то возвращать стандартное значение AKA ADVENTURE или любой режим игры который ты хочешь
        };
        //todo по умолчанию CommandSender это любой исполнитель команды, будь то игрок или консоль
        //todo ты можешь ограничить выполнение команды для консоли, или сделать ее выполнимой только для игрока
        if (sender instanceof Player player) {
            // если исполнитель команды это игрок, которого мы обозначили как player
            player.setGameMode(gm);//todo установка режима игры который мы нашли выше
            player.sendMessage(Component.text("Установлен режим ").color(GREEN).append(Component.text(gm.name().toLowerCase()).color(GRAY)));
        }
        //todo ну тыпонял да?
        return true;
    }
}