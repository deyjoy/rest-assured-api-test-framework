package com.portfolioapitest.config;

import io.github.cdimascio.dotenv.Dotenv;

/**
 * Config class to manage application configurations using dotenv.
 */
public class Config {
    private static final Dotenv dotenv = Dotenv.load();

    /**
     * Method to get the value of a given environment variable key.
     *
     * @param key Environment variable key.
     * @return Value of the environment variable.
     */
    public static String get(String key) {
        String value = dotenv.get(key.toUpperCase());
        if (value == null) {
            throw new IllegalArgumentException("Environment variable " + key + " not set.");
        }
        return value;
    }
}
