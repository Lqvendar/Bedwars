package me.lavender.bedwars;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bedwars extends JavaPlugin {
    @Getter
    private static Bedwars instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
