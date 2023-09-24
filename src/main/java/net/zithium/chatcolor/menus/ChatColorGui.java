package net.zithium.chatcolor.menus;

import dev.triumphteam.gui.guis.Gui;
import net.zithium.chatcolor.ZithiumChatColor;
import net.zithium.library.utils.Color;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class ChatColorGui {

    private final ZithiumChatColor plugin;


    public ChatColorGui(ZithiumChatColor plugin) {
        this.plugin = plugin;
    }


    public void open(Player player) {
        FileConfiguration config = plugin.getConfig();
        Gui gui = Gui.gui()
                .rows(config.getInt("menu.rows"))
                .title(Color.componentColor(config.getString("menu.title")))
                .create();

        gui.setDefaultClickAction(event -> event.setCancelled(true));
        gui.open(player);
    }
}
