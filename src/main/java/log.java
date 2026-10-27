import java.util.logging.Logger;

/**
 * 此方法不稳定
 *
 * @author XinYue Meko
 */
public class log {
    private final Logger l = Logger.getLogger("Minecraft");

    public void info(String message) {
        l.info(ChatColor.toANSI(message + ChatColor.RESET));
    }

    public void warning(String message) {
        l.warning(ChatColor.toANSI(message + ChatColor.RESET));
    }

}
