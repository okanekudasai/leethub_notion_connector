class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int N = nums.length;
        int [] flip_count = new int [N];
        int num_to_change = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            q.offerLast(nums[i]);
        }
        int answer = 0;
        for (int i = k; i < nums.length; i++) {
            flip_count[i] += flip_count[i-1];
            if (q.pollFirst() == num_to_change) {
                answer++;
                num_to_change ^= 1;
                flip_count[i]++;
            }
            q.offerLast((flip_count[i]+nums[i]) % 2);
            // System.out.println(q);
        }
        if (q.pollFirst() == num_to_change) {
            answer++;
            num_to_change ^= 1;
        }
        while (!q.isEmpty()) {
            if (q.pollFirst() == num_to_change) return -1;
        }
        return answer;        
    }
}

/*
00010110
11101221
   
00111001010
    1   
11001001010
      1
11110101010
  

111

00111
01001
10101
11011
10010
11100

0111
1001
0110
0001

111
000


00010110
11101001
11100000
11100111
11101221

0010100010010
1100100010010
1111000010010
1111111010010
1111111101010
1111111110101
1111111111011


11001
11110
*/