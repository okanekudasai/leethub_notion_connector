class Solution {
    public int specialArray(int[] nums) {
        int count;
        int answer = -1;///
        for (int i = 0; i <= 1000; i++) {
            count = 0;
            for (int n : nums) {
                if (n >= i) count++;
            }
            if (count == i) answer = i;
        }
        return answer;
    }
}