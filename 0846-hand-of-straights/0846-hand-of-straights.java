class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        Arrays.sort(hand);
        int N = hand.length;
        for (int i = 0; i < N; i++) {
            if (hand[i] == -2) continue;
            int f = hand[i];
            hand[i] = -2;
            boolean flag = finding(1, groupSize, f+1, i+1, hand, N);
            if (!flag) false;
        }
        return true;
    }
    boolean finding(int count, int groupSize, int f, int index, int [] hand, int N) {
        if (count == groupSize) {
            return true;
        }
        
        boolean flag = false;

        for (int i = index; i < N; i++) {
            if (hand[i] < f) continue;
            if (hand[i] > f) break;
            hand[i] = -2;
            flag = finding(count+1, groupSize, f+1, i+1, hand, N);
        }

        return flag;
    }
}