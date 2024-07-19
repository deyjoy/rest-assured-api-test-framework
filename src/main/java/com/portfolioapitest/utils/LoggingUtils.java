package com.portfolioapitest.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Utility class for logging configuration and management.
 */
public class LoggingUtils {
    private static final Logger logger = Logger.getLogger(LoggingUtils.class.getName());

    static {
        try {
            // Ensure logs directory exists
            Files.createDirectories(Paths.get("logs"));
            LogManager.getLogManager().readConfiguration(LoggingUtils.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Could not load logging configuration", e);
        }
    }

    /**
     * Method to get a configured logger for the given class.
     *
     * @param clazz The class for which the logger is to be configured.
     * @return Configured Logger instance.
     */
    public static Logger getLogger(Class<?> clazz) {
        return Logger.getLogger(clazz.getName());
    }
}
