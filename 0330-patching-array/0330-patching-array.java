class Solution {
    public int minPatches(int[] nums, int n) {
        Arrays.sort(nums);
        long acc = 0;
        int t = 1;
        int answer = 0;
        while (true) {
            if (t >= nums[0]) {
                acc += nums[0];
                break;
            }
            acc += t;
            t *= 2;
            answer++;
        }

        int i = 1;
        while (true) {
            long next = acc + 1;
            // System.out.println("*" + next);
            if (i < nums.length && nums[i] <= next) {
                acc += nums[i];
                i++;
            } else {
                answer++;
                // System.out.println(acc + 1);
                acc += acc + 1;
            }
            if (acc >= n) break;
        }
        return answer;
    }
}
/*
1 2 4 8 16 -> 31
1 2 4 5 6  -> 12
*/