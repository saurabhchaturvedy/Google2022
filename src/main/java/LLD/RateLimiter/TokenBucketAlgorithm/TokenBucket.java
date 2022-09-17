package main.java.LLD.RateLimiter.TokenBucketAlgorithm;

import main.java.LLD.RateLimiter.RateLimiter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class TokenBucket implements RateLimiter {

    private Integer bucketCapacity;
    private Integer refreshRate;
    private AtomicInteger currentCapacity;
    private AtomicLong lastUpdatedTime;

    TokenBucket(int bucketCapacity, int refreshRate) {
        this.bucketCapacity = bucketCapacity;
        this.refreshRate = refreshRate;
        this.currentCapacity = new AtomicInteger(bucketCapacity);
        this.lastUpdatedTime = new AtomicLong(System.currentTimeMillis());
    }

    @Override
    public boolean grantAccess() {
        refreshBucket();
        if (currentCapacity.get() > 0) {
            currentCapacity.decrementAndGet();
            return true;
        }
        return false;
    }


    private void refreshBucket() {
        long currentTime = System.currentTimeMillis();
        int additionalToken = (int) ((currentTime - lastUpdatedTime.get()) / 1000 * refreshRate);
        int currCapacity = Math.min(currentCapacity.get() + additionalToken, bucketCapacity);
        currentCapacity.getAndSet(currCapacity);
        lastUpdatedTime.getAndSet(currentTime);

    }
}
