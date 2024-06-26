package net.lewmc.jailhouse.utils;

import net.lewmc.jailhouse.Jailhouse;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

/**
 * Jailhouse's Messaging Utility
 */
public class MessageUtil {

    private final CommandSender cs;
    private final Jailhouse plugin;

    /**
     * Constructor for the MessageUtil class
     *
     * @param cs     CommandSender - the user who sent the command.
     * @param plugin Reference to the main Essence class.
     */
    public MessageUtil(CommandSender cs, Jailhouse plugin) {
        this.cs = cs;
        this.plugin = plugin;
    }

    /**
     * Send a message to the user.
     * @param message String - The message taken from the language file.
     */
    public void PrivateMessage(String message) {
        this.cs.sendMessage(ChatColor.GOLD + "[Jailhouse] " + ChatColor.YELLOW + message);
    }

    /**
     * Send a message to a specific user.
     * @param cs CommandSender - Who to send the message to.
     * @param message String - The message taken from the language file.
     */
    public void SendTo(CommandSender cs, String message) {
        cs.sendMessage(ChatColor.GOLD + "[Jailhouse] " + ChatColor.YELLOW + message);
    }
}