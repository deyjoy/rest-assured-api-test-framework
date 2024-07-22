package com.portfolioapitest.tests;

import com.portfolioapitest.services.PostService;
import com.portfolioapitest.utils.LoggingUtils;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test class for PostService.
 */
class TestPosts {
    private static final Logger logger = LoggingUtils.getLogger(TestPosts.class);
    private final PostService postService = new PostService();

    /**
     * Test to get all posts.
     */
    @Test
    void testGetPosts() {
        String baseUrl = System.getenv("BASE_URL");
        if (baseUrl == null) {
            logger.severe("BASE_URL environment variable is not set. Skipping testGetPosts.");
            return; // Skip the test if BASE_URL is not set
        }

        logger.info("Starting testGetPosts");
        Response response = postService.getPosts();
        logger.info("Received response: " + response.getStatusCode());
        assertThat(response.getStatusCode()).isEqualTo(200);
        logger.info("testGetPosts completed successfully");
    }
}
