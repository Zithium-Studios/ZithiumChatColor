package net.zithium.chatcolor.player;

import net.zithium.chatcolor.ZithiumChatColor;

import java.util.UUID;

public interface PlayerData {

    boolean onEnable(final ZithiumChatColor plugin);

    void onDisable();

    PlayerData getPlayer(final UUID uuid);

    void savePlayer(final PlayerData playerData);
}
