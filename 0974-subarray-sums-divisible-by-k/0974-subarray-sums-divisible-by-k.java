class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int N = nums.length;
        int [] sub_sum = new int [N+1];
        for (int i = 1; i <= N; i++) {
            sub_sum[i] = sub_sum[i-1] + nums[i-1];
        }
        int [] count = new int [k];
        for (int i : sub_sum) {
            int t = i;
            if (t < 0) {
                int c = (Math.abs(t) / k) + 1;
                t += k * c;
            }
            count[t % k]++;
        }
        int answer = 0;
        for (int i : count) {
            if (i <= 1) continue;
            answer += (i * (i-1)) / 2;
        }
        return answer;
    }
}

/*

0 4 9 9 7 4 5
0 4 4 4 2 4 0
300,000,000

*/