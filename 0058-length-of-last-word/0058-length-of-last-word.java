class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int length = 0;

        // Last ke spaces skip karo
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Last word count karo
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}