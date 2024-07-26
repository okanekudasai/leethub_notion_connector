class Solution {
    public int findCenter(int[][] edges) {
        boolean [] check = new boolean [edges.length + 2];
        int [] list = {edges[0][0], edges[0][1], edges[1][0], edges[1][1]};
        for (int i : list) {
            if (check[i]) return i;
            check[i] = true;
        }
        return 0;
    }
}