class Solution {
    public int specialArray(int[] nums) {
        int count;
        int answer = -1;///
        for (int i = 0; i <= 1000; i++) {//201231023156153153
//251561566512
//4564561684
            count = 0;/*vfvfvfvfvfvfvfvfv*/
            for (int n : nums) {
                if (n >= i) count++;
            }
            if (count == i) answer = i;
        }
        return answer;
    }
}