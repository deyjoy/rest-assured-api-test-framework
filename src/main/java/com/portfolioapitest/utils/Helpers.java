package com.portfolioapitest.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Helpers class containing utility methods for the project.
 */
public class Helpers {
    /**
     * Method to read the content of a JSON file.
     *
     * @param path Path to the JSON file.
     * @return Content of the JSON file as a String.
     * @throws IOException If an I/O error occurs reading from the file.
     */
    public static String readJsonFile(String path) throws IOException {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            throw new IOException("Failed to read the JSON file at: " + path, e);
        }
    }
}
