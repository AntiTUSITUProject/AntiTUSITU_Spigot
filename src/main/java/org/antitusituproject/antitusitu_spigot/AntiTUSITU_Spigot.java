// -- coding: utf-8 --
package org.antitusituproject.antitusitu_spigot;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public class AntiTUSITU_Spigot extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("    _          _   _ _____ _   _ ____ ___ _____ _   _ ");
        getLogger().info("   / \\   _ __ | |_(_)_   _| | | / ___|_ _|_   _| | | |");
        getLogger().info("  / _ \\ | '_ \\| __| | | | | | | \\___ \\| |  | | | | | |");
        getLogger().info(" / ___ \\| | | | |_| | | | | |_| |___) | |  | | | |_| |");
        getLogger().info("/_/   \\_\\_| |_|\\__|_| |_|  \\___/|____/___| |_|  \\___/ ");
        getLogger().info("----------");
        getLogger().info("插件已启用。任何邪恶，终将，绳之以法！");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("插件已停用。Have a nice day!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        String playerName = player.getName();

        UUID uuid = player.getUniqueId();
        if (uuid.toString().equals("51613bf4-505d-4dac-8a9e-00daea4a7bbb") || (playerName.equalsIgnoreCase("ApartTUSITU"))) {
            player.kickPlayer(ChatColor.GRAY + "[" + ChatColor.GOLD + "AntiTUSITU" + ChatColor.GRAY + "] " + ChatColor.RED + "您已被踢出服务器");
            return;
        }

        if (player.hasPermission("AntiTUSITU.info")) {
            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.GOLD + "AntiTUSITU" + ChatColor.GRAY + "] "  + ChatColor.AQUA + "感谢您选择AntiTUSITU插件。您可以前往" + ChatColor.LIGHT_PURPLE + "https://antotusituproject.asia" + ChatColor.AQUA + "获取更多信息。");
        }
    }
}
