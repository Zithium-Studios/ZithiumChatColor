package net.zithium.chatcolor.player.storage;

import net.zithium.chatcolor.ZithiumChatColor;
import net.zithium.chatcolor.player.PlayerData;

import java.util.UUID;

public interface StorageHandler {

    boolean onEnable(final ZithiumChatColor plugin);

    void onDisable();

    PlayerData getPlayer(final UUID uuid);

    void savePlayer(final PlayerData playerData);
}
