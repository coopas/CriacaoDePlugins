package com.coopas.tutorialspigot.Eventos;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class aoEntrarE implements Listener {

    @EventHandler
    public void aoEntrar(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        p.getWorld().playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5.0F, 1);
        p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§a+ " + "§r §7Bem vindo ao servidor! " + "§r§n§7" + p.getDisplayName()));
        e.setJoinMessage(null);
    }

}
