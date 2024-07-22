package com.portfolioapitest.services;

import com.portfolioapitest.api.ApiClient;
import io.restassured.response.Response;

/**
 * Service class to handle API requests related to posts.
 */
public class PostService {
    private static final String POSTS_ENDPOINT = "/posts";

    /**
     * Method to get all posts.
     *
     * @return Response object containing the API response.
     */
    public Response getPosts() {
        return ApiClient.getRequestSpec().get(POSTS_ENDPOINT);
    }
}
