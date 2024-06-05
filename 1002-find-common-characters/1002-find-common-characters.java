class Solution {
    public List<String> commonChars(String[] words) {
        int [] [] counter = new int [words.length] [26];
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            for (char c : w.toCharArray()) {
                counter[i][c-'a']++;
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            if (counter[0][i-'a'] == 0) continue;
            int c = counter[0][i-'a'];
            for (int j = 1; j < words.length; j++) {
                c = Math.min(c, counter[j][i-'a']);
            }
            for (int j = 0; j < c; j++) {
                list.add(String.valueOf((char) i));
            }
        }
        return list;
    }
}