package com.example.ratelimiter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenBucketRateLimiterTest {

    @Test
    void testBasicRateLimitBehavior() {
        RateLimiter limiter = new TokenBucketRateLimiter(5, 1);
        for (int i = 0; i < 5; i++) {
            assertTrue(limiter.allowRequest());
        }
        assertFalse(limiter.allowRequest()); // Should be rate limited
    }
}