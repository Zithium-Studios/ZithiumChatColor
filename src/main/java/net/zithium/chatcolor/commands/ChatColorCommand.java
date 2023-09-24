package net.zithium.chatcolor.commands;

import me.mattstudios.mf.annotations.Command;
import me.mattstudios.mf.annotations.Default;
import me.mattstudios.mf.base.CommandBase;
import net.zithium.chatcolor.ZithiumChatColor;
import net.zithium.chatcolor.menus.ChatColorGui;
import org.bukkit.entity.Player;

@Command("chatcolor")
public class ChatColorCommand extends CommandBase {

    private final ChatColorGui chatColorGui;
    private final ZithiumChatColor plugin;

    public ChatColorCommand(ZithiumChatColor plugin) {
        this.plugin = plugin;
        this.chatColorGui = new ChatColorGui(plugin);
    }

    @Default
    public void chatColorCommand(Player player) {
        chatColorGui.open(player);
    }
}
