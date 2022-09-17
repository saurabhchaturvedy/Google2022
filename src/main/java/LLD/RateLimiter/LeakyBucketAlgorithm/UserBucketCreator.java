package main.java.LLD.RateLimiter.LeakyBucketAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class UserBucketCreator {

    Map<Integer,LeakyBucket> leakyBucket;


   UserBucketCreator(int id )
    {
        leakyBucket = new HashMap<>();
        leakyBucket.put(id,new LeakyBucket(10));
    }

    public void accessApp(int id)
    {
        if (leakyBucket.get(id).grantAccess()) {
            System.out.println(Thread.currentThread().getName() + " able to access the app");
        } else {

            System.out.println(Thread.currentThread().getName() + " too many requests , try after some time");
        }
    }
}
