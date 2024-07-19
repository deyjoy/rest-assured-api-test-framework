package com.portfolioapitest.api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

/**
 * ApiClient class to configure the base URI and request specifications for API calls.
 */
public class ApiClient {
    private static final String BASE_URL = System.getenv("BASE_URL");

    /**
     * Method to get the request specification with base URI and headers.
     *
     * @return RequestSpecification object with configured base URI and headers.
     */
    public static RequestSpecification getRequestSpec() {
        // Validate if BASE_URL is not null
        if (BASE_URL == null) {
            throw new IllegalArgumentException("BASE_URL environment variable not set.");
        }
        return RestAssured.given().baseUri(BASE_URL).header("Content-Type", "application/json");
    }
}
