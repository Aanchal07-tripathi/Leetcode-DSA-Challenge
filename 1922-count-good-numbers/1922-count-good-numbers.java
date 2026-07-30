class Solution {

    long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long evenplace = (n + 1) / 2;
        long oddplace = n / 2;

        long even = power(5, evenplace);
        long odd = power(4, oddplace);

        return (int)((even * odd) % MOD);
    }

    long power(long x, long n) {

        if (n == 0)
            return 1;

        long half = power(x, n / 2);

        long ans = (half * half) % MOD;

        if (n % 2 == 1)
            ans = (ans * x) % MOD;

        return ans;
    }
}