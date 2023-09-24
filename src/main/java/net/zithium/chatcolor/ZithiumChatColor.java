package net.zithium.chatcolor;

import me.mattstudios.mf.base.CommandManager;
import net.zithium.chatcolor.commands.ChatColorCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class ZithiumChatColor extends JavaPlugin {


    @Override
    public void onEnable(){

        // Loading the commands
        loadCommands();

    }



    private void loadCommands(){
        getLogger().log(Level.INFO, "Loading command manager...");
        CommandManager commandManager = new CommandManager(this);
        commandManager.register(new ChatColorCommand(this));
    }
}
