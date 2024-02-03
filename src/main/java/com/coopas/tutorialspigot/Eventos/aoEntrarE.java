package com.coopas.tutorialspigot.Eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class aoEntrarE implements Listener {

    @EventHandler
    public void aoEntrar(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.setJoinMessage(" §a+ §r§n§7" + p.getDisplayName() + "§r §7Entrou no servidor");
    }

}
