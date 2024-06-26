package net.lewmc.jailhouse.commands;

import net.lewmc.jailhouse.Jailhouse;
import net.lewmc.jailhouse.utils.MessageUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class JailhouseCommand implements CommandExecutor {
    private final Jailhouse plugin;

    /**
     * Constructor for the JailhouseCommand class.
     * @param plugin References to the main plugin class.
     */
    public JailhouseCommand(Jailhouse plugin) {
        this.plugin = plugin;
    }

    /**
     * /jailhouse command handler.
     * @param commandSender Information about who sent the command - player or console.
     * @param command Information about what command was sent.
     * @param s Command label - not used here.
     * @param args The command's arguments.
     * @return boolean true/false - was the command accepted and processed or not?
     */
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        MessageUtil message = new MessageUtil(commandSender, this.plugin);

        if (command.getName().equalsIgnoreCase("jailhouse")) {
            message.PrivateMessage("Running Jailhouse version " + plugin.getDescription().getVersion());
            message.PrivateMessage("Created by LewMC.");

            return true;
        }

        return true;
    }
}