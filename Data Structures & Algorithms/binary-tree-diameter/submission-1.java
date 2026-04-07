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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null || root.left == null & root.right == null){
            return 0;
        } else{
            int left = 0;
            int right = 0;
            int left_diameter = 0;
            int right_diameter = 0;
            if(root.left != null){
                left = maxDepth(root.left);
                left_diameter = diameterOfBinaryTree(root.left);
            }
            if(root.right != null){
                right = maxDepth(root.right);
                right_diameter = diameterOfBinaryTree(root.right);
            }
            int current_diameter = left + right;
            if(left_diameter > current_diameter){
                return left_diameter;
            } else if(right_diameter > current_diameter){
                return right_diameter;
            } else{
                return left + right;
            }
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = 0;
        int right = 0;

        if(root.left != null){
            left = maxDepth(root.left);
        }

        if(root.right != null){
            right = maxDepth(root.right);
        }

        if(left > right){
            return left + 1;
        } else{
            return right + 1;
        }
    }
}

//         if(root == null){
//             return 0;
//         }
//         int left = 0;
//         int right = 0;

//         if(root.left != null){
//             left = maxDepth(root.left);
//         }

//         if(root.right != null){
//             right = maxDepth(root.right);
//         }

//         if(left > right){
//             return left + 1;
//         } else{
//             return right + 1;
//         }