class Solution {
    public int heightChecker(int[] heights) {
        int N = heights.length;
        int [] copy = new int [N];
        for (int i = 0; i < N; i++) copy[i] = heights[i];
        Arrays.sort(heights);
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (copy[i] == heights[i]) continue;
            answer++;
        }
        return answer;
    }
}