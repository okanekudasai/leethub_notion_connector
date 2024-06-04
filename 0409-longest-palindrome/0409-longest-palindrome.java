class Solution {
    public int longestPalindrome(String s) {
        int [] counter = new int [58];
        for (char c : s.toCharArray()) {
            counter[c-'A']++;
        }
        int max_odd = 0;
        int answer = 0;
        int flag = 0;
        for (int i : counter) {
            if (i % 2 == 1) {
                answer += i - 1;
                flag = 1;
            }
            else answer += i;
        }
        answer += flag;
        return answer;
    }
}