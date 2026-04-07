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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> node_list = new ArrayList<>();
        if(root != null){
            search(root, node_list);
        } 
        return node_list;
    }

    public void search(TreeNode root, List<Integer> list){
        if(root != null){
            search(root.left, list);
            list.add(root.val);
            search(root.right, list);
        }
    }
}