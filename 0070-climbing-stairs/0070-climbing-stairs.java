class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int[] sp = new int[n+1];
        sp[1] = 1;
        sp[2] = 2;
        for(int i = 3; i <= n; i++){
            sp[i] = sp[i-1] + sp[i-2];
        }
        return sp[n];
    }
}