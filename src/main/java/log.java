import java.util.logging.Logger;

/* PluginLogger */
public class log {
    public final Logger l = Logger.getLogger("Minecraft");

    public void info(String message) {
        l.info(ChatColor.toANSI(message + ChatColor.RESET));
    }

    public void warning(String message) {
        l.warning(ChatColor.toANSI(message + ChatColor.RESET));
    }

}
