package xyz.itsylands.test.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener {

    @EventHandler
    public static void onPlayerjoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
    player.sendMessage(ChatColor.LIGHT_PURPLE + "Welcome To Itsylands");
    }
}
