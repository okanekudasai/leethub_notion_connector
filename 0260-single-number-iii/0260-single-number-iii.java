class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) set.remove(i);
            else set.add(i);
        }
        ///
        // asfefaes
        int [] answer  = new int [2];
        int index = 0;
        for (int i : set) {
            answer[index++] = i;
        }
        return answer;
    }
}