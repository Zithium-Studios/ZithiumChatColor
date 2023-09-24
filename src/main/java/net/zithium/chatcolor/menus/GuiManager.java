package net.zithium.chatcolor.menus;

import net.zithium.chatcolor.ZithiumChatColor;

public class GuiManager {

    private final ZithiumChatColor plugin;
    private ChatColorGui chatColorGui;

    public GuiManager(ZithiumChatColor plugin){
        this.plugin = plugin;
    }


    public void onEnable(){
        chatColorGui = new ChatColorGui(plugin);
    }


}
