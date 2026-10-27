import com.sun.org.glassfish.gmbal.Description;

import java.util.logging.Logger;

@Description("不稳定")
public class log {
    private final Logger l = Logger.getLogger("Minecraft");

    public void info(String message) {
        l.info(ChatColor.toANSI(message + ChatColor.RESET));
    }

    public void warning(String message) {
        l.warning(ChatColor.toANSI(message + ChatColor.RESET));
    }

}
