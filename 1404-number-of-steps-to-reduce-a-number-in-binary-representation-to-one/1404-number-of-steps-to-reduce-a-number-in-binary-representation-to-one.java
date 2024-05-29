class Solution {
    public int numSteps(String s) {
        ArrayDeque<Boolean> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            stack.offerFirst(s.charAt(i) == '1');
        }
        int answer = 0;
        while(true) {
            if (stack.size() == 1) break;
            if (!stack.peekFirst()) {
                stack.pollFirst();
                answer++;
            } else {
                while (!stack.isEmpty() && stack.peekFirst()) {
                    stack.pollFirst();
                    answer++;
                } 
                if (!stack.isEmpty()) stack.pollFirst();
                stack.offerFirst(true);
                answer++;
            }
            // System.out.println(answer + " " + stack);
        }
        return answer;
    }
}