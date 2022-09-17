package main.java.LLD.RateLimiter.TokenBucketAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class UserBucketCreator {

    Map<Integer, TokenBucket> tokenBucket;

    UserBucketCreator(int id) {
        tokenBucket = new HashMap<>();
        tokenBucket.put(id, new TokenBucket(10, 10));
    }

    void accessApp(int id) {

        if (tokenBucket.get(id).grantAccess()) {
            System.out.println(Thread.currentThread().getName() + " able to access the app");
        } else {

            System.out.println(Thread.currentThread().getName() + " too many requests , try after some time");
        }
    }


}
