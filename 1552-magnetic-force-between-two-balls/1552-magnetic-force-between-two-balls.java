class Solution {
    boolean checking(int [] position, int m, int t) {
        int count = 1;
        int p = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - p < t) continue;
            count++;
            if (count >= m) {
                System.out.println("*" + t + " " + count);
                return true;
            }
            p = position[i];
        }
        // System.out.println("*" + t + " " + count);
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 0;
        int right = position[position.length - 1] + 1;
        while (true) {
            if (left + 1 >= right) break;
            int mid = (left + right) / 2;
            if (checking(position, m, mid)) left = mid;
            else right = mid;
            // System.out.println(left + " " + right);
        }
        return left;
    }
}