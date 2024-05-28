import java.util.*;

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int N = s.length();
        int [] data = new int [N];
        for (int i = 0; i < N; i++) {
            data[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int start = 0;
        int end = -1;
        int count = 0;
        int answer = 0;
        while (true) {
            end = Math.min(N-1, end+1);
            count += data[end];
            while (true) {
                if (count > maxCost) {
                    count -= data[start];
                    start++;
                } else break;
            }
            // System.out.println(end - start + 1);
            answer = Math.max(answer, end - start + 1);
            if (end == N-1) break;
        }
        return answer;
    }
}