class Solution {
    public int appendCharacters(String s, String t) {
        ArrayDeque<Character> q = new ArrayDeque<>();
        for (int i = 0; i < t.length(); i++) q.offerLast(t.charAt(i));
        char check = q.peekFirst();
        for (int i = 0; i < s.length(); i++) {
            if (check == s.charAt(i)) {
                q.pollFirst();
                if (q.isEmpty()) return 0;
                check = q.peekFirst();
            }
        }
        return q.size();
    }
}