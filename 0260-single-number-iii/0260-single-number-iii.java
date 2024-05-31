class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) set.remove(i);
            else set.add(i);
        }
        ///
        //848484
        // asfefaes
        //959595959
        int [] answer  = new int [2];
        int index = 0;
        for (int i : set) {
            answer[index++] = i;
        }
        return answer;
    }
}