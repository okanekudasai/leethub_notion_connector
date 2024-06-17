class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i <= 47000; i++) {
            if ((long)i * i > (long)c) {
                return false;
            }
            int b = c - i * i;
            int t = (int) Math.sqrt(b);
            if (t*t == b) break;
        }
        return true;
    }
}

/*
28


 12345678
 0
1 2 5 10 17 26 37 50
2   8 13 20 29 40 53
3     18 25 34 45 58 
4        32 41 52 65
5           50
6
7
8
*/