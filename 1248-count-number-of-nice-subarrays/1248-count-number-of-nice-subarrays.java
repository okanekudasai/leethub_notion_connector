class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i : nums) {
            if (i % 2 == 0) count++;
            else {
                list.add(count);
                count = 0;
            }
        }
        list.add(count);
        int index = 0;
        int answer = 0;
        int N = list.size();
        while (true) {
            if (index+k >= N) break;
            answer += (list.get(index)+1) * (list.get(index+k)+1);
            index++;
        }
        // System.out.println(list);
        return answer;
    }
}

/*
11121211
11011


00010010001000100
00011122223333444
3-2-3-3-2

001100

2-0-2
*/