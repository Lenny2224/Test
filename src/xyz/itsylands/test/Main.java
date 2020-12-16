package xyz.itsylands.test;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.itsylands.test.Commands.Commands;
import xyz.itsylands.test.Events.Events;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new Events(), this);
        getCommand("forum").setExecutor(new Commands());
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Test] Test is enabled");
    }

    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Test] Test is disabled");
    }


}
