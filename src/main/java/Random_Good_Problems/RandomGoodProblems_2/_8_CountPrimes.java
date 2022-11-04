package main.java.Random_Good_Problems.RandomGoodProblems_2;

import java.util.Arrays;

class _8_CountPrimes {
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, 2, n, true);
        
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}