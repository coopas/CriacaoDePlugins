package com.coopas.tutorialspigot;

import com.coopas.tutorialspigot.Comandos.FlyC;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§a - PluginTutorial Iniciado com sucesso!");
        comandos();
    }

    public void comandos() {
        getCommand("fly").setExecutor(new FlyC());
    }


    @Override
    public void onDisable() {
    }
}