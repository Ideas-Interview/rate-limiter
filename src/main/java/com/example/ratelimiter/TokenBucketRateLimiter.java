package com.example.ratelimiter;

/**
 * A stub for token bucket implementation.
 */
public class TokenBucketRateLimiter implements RateLimiter {

    private final int capacity;
    private final int refillRate; // tokens per second

    // TODO: Add fields for token count, timestamp, etc.

    public TokenBucketRateLimiter(int capacity, int refillRate) {
        this.capacity = capacity;
        this.refillRate = refillRate;
        // TODO: Initialize fields
    }

    @Override
    public boolean allowRequest() {
        // TODO: Implement token bucket logic
        return false;
    }
}
