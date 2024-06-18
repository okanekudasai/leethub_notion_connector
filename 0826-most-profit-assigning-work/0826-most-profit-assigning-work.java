class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int N = difficulty.length;
        int M = worker.length;
        int p = M-1;
        Arrays.sort(difficulty);
        Arrays.sort(worker);
        int answer = 0;
        for (int i = N-1; i >= 0; i--) {
            while (p >= 0 && difficulty[i] <= worker[p]) {
                // System.out.println(profit[i]);
                answer += profit[i];
                p--;
            }
        }
        return answer;
    }
}