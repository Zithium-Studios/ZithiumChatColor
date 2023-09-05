package net.zithium.chatcolor.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class TextUtils {

    public static Component color(String message) {
        return MiniMessage.miniMessage().deserialize(replaceLegacy("<!i>" + message));
    }

    public static String replaceLegacy(String legacyText) {
        return legacyText
                .replaceAll("&1", "<dark_blue>")
                .replaceAll("&2", "<dark_green>")
                .replaceAll("&3", "<dark_aqua>")
                .replaceAll("&4", "<dark_red>")
                .replaceAll("&5", "<dark_purple>")
                .replaceAll("&6", "<gold>")
                .replaceAll("&7", "<gray>")
                .replaceAll("&8", "<dark_gray>")
                .replaceAll("&9", "<blue>")
                .replaceAll("&a", "<green>")
                .replaceAll("&b", "<aqua>")
                .replaceAll("&c", "<red>")
                .replaceAll("&d", "<light_purple>")
                .replaceAll("&e", "<yellow>")
                .replaceAll("&f", "<white>")
                .replaceAll("&l", "<bold>")
                .replaceAll("&k", "<obfuscated>")
                .replaceAll("&m", "<strikethrough>")
                .replaceAll("&n", "<u>")
                .replaceAll("&r", "<reset>");
    }
}
