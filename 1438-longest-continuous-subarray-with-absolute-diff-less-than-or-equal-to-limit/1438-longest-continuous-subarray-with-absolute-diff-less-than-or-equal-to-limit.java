class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int N = nums.length;
        ArrayDeque<Integer> desc = new ArrayDeque<>();
        ArrayDeque<Integer> asc = new ArrayDeque<>();
        int left = 0;
        int answer = 1;
        for (int right = 0; right < N; right++) {
            while (!desc.isEmpty() && desc.peekLast() < nums[right]) desc.pollLast();
            while (!asc.isEmpty() && asc.peekLast() > nums[right]) asc.pollLast();
            desc.offerLast(nums[right]);
            asc.offerLast(nums[right]);
            while (desc.peekFirst() - asc.peekFirst() > limit) {
                if (!desc.isEmpty() && desc.peekFirst() <= nums[left]) desc.pollFirst();
                if (!asc.isEmpty() && asc.peekFirst() >= nums[left]) asc.pollFirst();
                left++;
            }
            // System.out.println("*" + desc);
            // System.out.println(asc);
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }
}