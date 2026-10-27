public class ChatColor {
    public static final String COLOR_CHAR = "\u00A7";

    public static final String BLACK = "§0";
    public static final String DARK_BLUE = "§1";
    public static final String DARK_GREEN = "§2";
    public static final String DARK_AQUA = "§3";
    public static final String DARK_RED = "§4";
    public static final String DARK_PURPLE = "§5";
    public static final String GOLD = "§6";
    public static final String GREY = "§7";
    public static final String DARK_GREY = "§8";
    public static final String BLUE = "§9";
    public static final String GREEN = "§a";
    public static final String AQUA = "§b";
    public static final String RED = "§c";
    public static final String LIGHT_PURPLE = "§d";
    public static final String YELLOW = "§e";
    public static final String WHITE = "§f";
    public static final String RESET = COLOR_CHAR + "r";

    public static String clean(String message) {
        return message.replaceAll("(?i)\u00a7[0-9a-fr]", "");
    }

    public static String toANSI(String text) {
        if (text == null) return null;
        text = text.replace(RESET, (char) 0x1b + "[0m");
        text = text.replace(BLACK, (char) 0x1b + "[0;30m");
        text = text.replace(DARK_BLUE, (char) 0x1b + "[0;34m");
        text = text.replace(DARK_GREEN, (char) 0x1b + "[0;32m");
        text = text.replace(DARK_AQUA, (char) 0x1b + "[0;36m");
        text = text.replace(DARK_RED, (char) 0x1b + "[0;31m");
        text = text.replace(DARK_PURPLE, (char) 0x1b + "[0;35m");
        text = text.replace(GOLD, (char) 0x1b + "[0;33m");
        text = text.replace(GREY, (char) 0x1b + "[0;37m");
        text = text.replace(DARK_GREY, (char) 0x1b + "[30;1m");
        text = text.replace(BLUE, (char) 0x1b + "[34;1m");
        text = text.replace(GREEN, (char) 0x1b + "[32;1m");
        text = text.replace(AQUA, (char) 0x1b + "[36;1m");
        text = text.replace(RED, (char) 0x1b + "[31;1m");
        text = text.replace(LIGHT_PURPLE, (char) 0x1b + "[35;1m");
        text = text.replace(YELLOW, (char) 0x1b + "[33;1m");
        text = text.replace(WHITE, (char) 0x1b + "[37;1m");
        return text;
    }
}
