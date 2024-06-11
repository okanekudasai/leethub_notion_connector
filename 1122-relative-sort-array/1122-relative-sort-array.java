import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] counter = new int [1001];
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr2) set.add(i);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr1) {
            if (set.contains(i)) counter[i]++;
            else pq.offer(i);
        }
        int [] answer = new int [arr1.length];
        int index = 0;
        for (int i : arr2) {
            for (int j = 0; j < counter[i]; j++) {
                answer[index++] = i;
            }
            // System.out.println(Arrays.toString(answer));
        }
        while(!pq.isEmpty()) answer[index++] = pq.poll();
        return answer;
    }
}