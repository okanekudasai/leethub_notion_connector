/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode answer;
    public TreeNode bstToGst(TreeNode root) {
        PriorityQueue<TreeNode> pq = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        int total_sum = gogo(root, pq);
        while (!pq.isEmpty()) {
            TreeNode node = pq.poll();
            total_sum -= node.val;
            node.val += total_sum;
        }
        return root;
    }
    int gogo(TreeNode node, PriorityQueue<TreeNode> pq) {
        if (node == null) return 0;
        pq.offer(node);
        return node.val + gogo(node.left, pq) + gogo(node.right, pq);
    }
}