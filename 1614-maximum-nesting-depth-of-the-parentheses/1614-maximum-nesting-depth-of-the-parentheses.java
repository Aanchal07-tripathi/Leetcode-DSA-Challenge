class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int x = 0;
        for (char i : s.toCharArray()){
            if(i == '('){
                x++;
            }
            if(i == ')'){
                x--;
            }
            ans = Math.max(ans, x);
        }
        return ans;
    }
}