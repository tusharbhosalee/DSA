class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] present = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (present[idx]) continue;

            while (!stack.isEmpty() &&
                   stack.peek() > ch &&
                   lastIndex[stack.peek() - 'a'] > i) {
                
                present[stack.peek() - 'a'] = false;
                stack.pop();
            }

            stack.push(ch);
            present[idx] = true;
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}