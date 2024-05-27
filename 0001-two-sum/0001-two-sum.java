class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] answer = new int [2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);//
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.keySet().contains(target - nums[i]) && i != map.get(target - nums[i])) {
                answer[0] = i;
                answer[1] = map.get(target - nums[i]);
                break;
            }
        }
        return answer;
    }
}