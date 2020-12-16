package xyz.itsylands.test.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) { return true; }
        Player player = (Player) sender;

        // forum
        if (cmd.getName().equalsIgnoreCase("forum")) {
            player.sendMessage("§eOur Forum is Itsylands.xyz");
        }

        return true;
    }
}
