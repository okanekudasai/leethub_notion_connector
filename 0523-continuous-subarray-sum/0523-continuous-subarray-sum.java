class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int N = nums.length;
        int [] ssd = new int [N+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            ssd[i] = (ssd[i-1] + nums[i-1]) % k;
        }
        for (int i = 0; i <= N; i++) {
            if (map.get(ssd[i]) != null && map.get(ssd[i]) < i-1) {
                return true;
            }
            if (map.get(ssd[i]) == null) {
                map.put(ssd[i], i);
            }   
        }
        return false;
    }
}