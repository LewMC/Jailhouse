package net.lewmc.jailhouse;

import net.lewmc.jailhouse.utils.LogUtil;
import net.lewmc.jailhouse.utils.UpdateUtil;
import org.bstats.bukkit.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main Jailhouse class.
 */
public final class Jailhouse extends JavaPlugin {

    private final LogUtil log = new LogUtil(this);

    /**
     * Main Jailhouse enable function.
     */
    @Override
    public void onEnable() {
        this.log.info("");
        this.log.info("  █ ▄▀▄ █ █   █ █ █▀█ █ █ █▀ █▀▀");
        this.log.info("█▄█ █▀█ █ █▄▄ █▀█ █▄█ █▄█ ▄█ ██▄");
        this.log.info("");
        this.log.info("Running Jailhouse version "+this.getDescription().getVersion()+ ".");
        this.log.info("Please report any issues with Jailhouse to our GitHub repository: https://github.com/lewmc/jailhouse/issues");
        this.log.info("");
        this.log.info("Beginning startup...");
        this.log.info("");
        int pluginId = 22187;
        new Metrics(this, pluginId);

        if (!Bukkit.getOnlineMode()) {
            this.log.severe(">> Your server is running in offline mode.");
            this.log.warn(">> This may allow players to bypass the banning system.");
            this.log.warn(">> We HIGHLY recommend using online mode.");
            this.log.info("");
        }

        initFileSystem();

        UpdateUtil update = new UpdateUtil(this);
        update.VersionCheck();
        update.UpdateConfig();

        this.log.info("Startup completed.");
    }

    /**
     * Initialise the file system.
     */
    private void initFileSystem() {
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
