class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int N = customers.length;
        int in_hand = 0;
        int [] not_in_hand = new int [N];
        for (int i = 0; i < N; i++) {
            if (grumpy[i] == 1) {
                not_in_hand[i] = customers[i];
            } else {
                in_hand += customers[i];
            }
        }
        int sum = in_hand;
        for (int i = 0; i < Math.min(minutes, N); i++) {
            sum += not_in_hand[i];
        }
        int answer = sum;
        for (int i = minutes; i < N; i++) {
            sum -= not_in_hand[i-minutes];
            sum += not_in_hand[i];
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}

/*
10121175
01010101

00020105
10101070
*/