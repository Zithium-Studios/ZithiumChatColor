package net.zithium.chatcolor;

import me.mattstudios.mf.base.CommandManager;
import net.zithium.chatcolor.commands.ChatColorCommand;
import net.zithium.library.configuration.ConfigHandler;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class ZithiumChatColor extends JavaPlugin {

    private ConfigHandler langFile;


    @Override
    public void onEnable() {

        // Loading the commands
        loadCommands();

        langFile = new ConfigHandler(this, "lang");
        langFile.saveDefaultConfig();

    }


    /**
     * Gets a FileConfiguration instance of the langFile
     *
     * @return Configuration file for langFile
     */
    public FileConfiguration getLangFile() {
        return langFile.getConfig();
    }

    private void loadCommands() {
        getLogger().log(Level.INFO, "Loading command manager...");
        CommandManager commandManager = new CommandManager(this);
        commandManager.register(new ChatColorCommand(this));
    }
}
