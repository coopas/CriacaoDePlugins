package com.coopas.tutorialspigot.Comandos;

import com.coopas.tutorialspigot.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyC implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("fly")) {

            if(sender instanceof Player) {
                Player p = (Player) sender;

                if(sender.hasPermission("plugin.fly")) {

                    if(p.getAllowFlight() == true) {
                        p.setAllowFlight(false);
                        sender.sendMessage(Main.messages.getConfig().getString("Fly.desativo")
                                .replace('&', '§'));
                    } else {
                        p.setAllowFlight(true);
                        sender.sendMessage(Main.messages.getConfig().getString("Fly.ativo")
                                .replace('&', '§'));
                    }

                } else {
                    sender.sendMessage("§cVoce nao possui permissao para utilizar este comando!");
                }

            } else {
                Bukkit.getConsoleSender().sendMessage("§cO /Fly so pode ser utilizado por jogadores!");
            }
        }


        return false;
    }
}
