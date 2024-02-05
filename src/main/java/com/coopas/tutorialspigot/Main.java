package com.coopas.tutorialspigot;

import com.coopas.tutorialspigot.Comandos.FlyC;
import com.coopas.tutorialspigot.Eventos.aoEntrarE;
import com.coopas.tutorialspigot.Utils.Config;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class Main extends JavaPlugin {

    public static Main plugin;
    public static Config config;
    public static Config  messages;

    @Override
    public void onEnable() {
        plugin = this;

        Bukkit.getConsoleSender().sendMessage("§a - PluginTutorial Iniciado com sucesso!");
        comandos();
        eventos();
        arquivos();
    }

    public void comandos() {
        getCommand("fly").setExecutor(new FlyC());
        Bukkit.getConsoleSender().sendMessage("§a - PluginTutorial COMANDOS carregados!");
    }

    public void eventos() {
        Bukkit.getPluginManager().registerEvents(new aoEntrarE(), this);
        Bukkit.getConsoleSender().sendMessage("§a - PluginTutorial EVENTOS carregados!");
    }

    public void arquivos() {

        config = new Config(plugin, "config.yml");
        config.saveDefaultConfig();
        messages = new Config(plugin, "messages.yml");
        messages.saveDefaultConfig();

        Bukkit.getConsoleSender().sendMessage("§a - PluginTutorial ARQUIVOS carregados!");

    }

    public void createFile(Main main, String fileName, boolean isFile) {
        try {
            File file = new File(main.getDataFolder() + File.separator + fileName);
            if (isFile) file.createNewFile();
            else if (!file.exists()) file.mkdirs();
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
    }
}