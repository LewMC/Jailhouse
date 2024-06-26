package net.lewmc.jailhouse.utils;

import org.bukkit.Bukkit;

import java.util.UUID;

/**
 * Player Utility
 */
public class PlayerUtil {
    /**
     * Retrieves a player's UUID from their username.
     * @param name String - The player's username.
     * @return UUID - The player's UUID.
     */
    public UUID getPlayerUUID(String name) {
        return Bukkit.getOfflinePlayer(name).getUniqueId();
    }

    /**
     * Retrieves a player's username from their UUID.
     * @param uuid UUID - The player's UUID.
     * @return String - The player's username.
     */
    public String getUsername(UUID uuid) {
        return Bukkit.getOfflinePlayer(uuid).getName();
    }
}
