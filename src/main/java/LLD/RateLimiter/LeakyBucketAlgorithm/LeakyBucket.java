package main.java.LLD.RateLimiter.LeakyBucketAlgorithm;

import main.java.LLD.RateLimiter.RateLimiter;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class LeakyBucket implements RateLimiter {

    BlockingQueue<Integer> queue;

    LeakyBucket(int capacity) {
        queue = new LinkedBlockingDeque<>(capacity);
    }

    @Override
    public boolean grantAccess() {

        if (queue.remainingCapacity() > 0) {
            queue.add(1);
            return true;
        }
        return false;
    }
}
