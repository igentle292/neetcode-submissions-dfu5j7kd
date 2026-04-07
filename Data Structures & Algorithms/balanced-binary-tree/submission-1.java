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
    public boolean isBalanced(TreeNode root) {
        if(root == null || root.left == null && root.right == null){
            return true;
        } else{
            int left_depth = maxDepth(root.left);
            int right_depth = maxDepth(root.right);

            boolean leftIsBalanced = isBalanced(root.left);
            boolean rightIsBalanced = isBalanced(root.right);

            return (leftIsBalanced && rightIsBalanced) && left_depth == right_depth || left_depth == right_depth + 1 || left_depth == right_depth - 1;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
