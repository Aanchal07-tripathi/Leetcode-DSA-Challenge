import java.util.Stack;

class Solution {
    public String smallestSubsequence(String s) {

        int[] freq = new int[26];
        boolean[] visited = new boolean[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Current character is processed
            freq[ch - 'a']--;

            // If already in stack, skip it
            if (visited[ch - 'a']) {
                continue;
            }

            // Remove bigger characters if they appear later
            while (!stack.isEmpty() &&
                    ch < stack.peek() &&
                    freq[stack.peek() - 'a'] > 0) {

                visited[stack.pop() - 'a'] = false;
            }

            // Add current character
            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        // Convert stack to string
        StringBuilder ans = new StringBuilder();

        for (char ch : stack) {
            ans.append(ch);
        }

        return ans.toString();
    }
}