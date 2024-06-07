class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        int dictionary_size = dictionary.size();
        HashSet<String> new_dict = new HashSet<>(dictionary);
        for (int i = 0; i < dictionary_size; i++) {
            for (int j = 0; j < dictionary_size; j++) {
                if (i == j) continue;
                if (!isAStartWithB(dictionary.get(i), dictionary.get(j))) continue;
                new_dict.remove(dictionary.get(j));
            }
        }
        StringBuilder sb = new StringBuilder();
        String [] ss = sentence.split(" ");
        for (String s : ss) {
            boolean flag = false;
            for (String t : new_dict) {
                if (!isAStartWithB(t, s)) continue;
                sb.append(t);
                flag = true;
                break;
            }
            if (!flag) sb.append(s);
            sb.append(' ');
        }
        // System.out.println(sb);
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    boolean isAStartWithB(String a, String b) {
        int N = a.length();
        int M = b.length();
        if (N > M) return false;
        for (int i = 0; i < N; i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
}