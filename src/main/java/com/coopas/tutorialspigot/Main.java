package com.coopas.tutorialspigot;

import com.coopas.tutorialspigot.Comandos.FlyC;
import com.coopas.tutorialspigot.Eventos.aoEntrarE;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {


        Bukkit.getConsoleSender().sendMessage("§a - PluginTutorial Iniciado com sucesso!");
        comandos();
        eventos();
    }

    public void comandos() {
        getCommand("fly").setExecutor(new FlyC());
        Bukkit.getConsoleSender().sendMessage("§a - PluginTutorial COMANDOS carregados!");
    }

    public void eventos() {
        Bukkit.getPluginManager().registerEvents(new aoEntrarE(), this);
        Bukkit.getConsoleSender().sendMessage("§a - PluginTutorial EVENTOS carregados!");
    }

    @Override
    public void onDisable() {
    }
}