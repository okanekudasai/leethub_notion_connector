class Solution {
    public int passThePillow(int n, int time) {
        int a = time / (n-1);
        int b = a % 2;
        int c = time % (n-1);
        if (b == 1) return n - c;
        return c + 1;
    }
}