class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()<=0) return true;
        if(s.length()>=t.length()) return false;
        int i =0;
        int j = 0;
        while(i<t.length()){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            } i++;
            if(j==s.length()) return true;
        }
        return false;
    }
}