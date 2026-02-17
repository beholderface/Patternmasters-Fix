package net.beholderface.patternmastersfix;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class PatternmastersFix {
    public static final String MOD_ID = "patternmasters_fix";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info("fixing patternmaster's");
    }
}
