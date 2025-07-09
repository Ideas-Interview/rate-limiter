package com.example.ratelimiter;

/**
 * Defines the interface for a rate limiter.
 */
public interface RateLimiter {
    /**
     * Attempts to acquire a token.
     * @return true if allowed, false if rate limit exceeded.
     */
    boolean allowRequest();
}
