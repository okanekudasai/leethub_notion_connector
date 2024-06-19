class Solution {
    boolean checking(int [] bloomDay, int m, int k, int t) {
        int remain = 0;
        for (int i = k-2; i >= 0; i--) {
            if (bloomDay[i] > t) {
                remain = i+1;
                break;
            }
        }
        int count = 0;
        for (int i = k-1; i < bloomDay.length; i++) {
            if (bloomDay[i] > t) {
                remain = k-1;
                continue;
            }
            if (remain > 0) {
                remain--;
                continue;
            }
            count++;
            remain = k-1;
        }
        // System.out.println("*" + t + " " + count);
        return count < m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int left = 0;
        int right = 1_000_000_001;
        while (true) {
            if (left + 1 >= right) break;
            int mid = (left + right) / 2;
            if (checking(bloomDay, m, k, mid)) left = mid;
            else right = mid; 
            // System.out.println(left + " " + right);
        }
        return (right >= 1_000_000_001) ? -1 : right;
    }
}
/*
684136577356
008846677766
  8  6  7  6
     6  7  6
    4  7   6

61567519216874351321248
00667779996888755533248
  6  7  3  6
   6  7
    7  5
3
6
7

777799712
077799972
007799992
  7  9  2
   7  9
    9  9
7
000779992
000799999
..

*/