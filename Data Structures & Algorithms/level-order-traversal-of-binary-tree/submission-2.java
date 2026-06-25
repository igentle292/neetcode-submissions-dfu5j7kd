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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> node_list = new ArrayList<>();
        if(root != null){
            search(root, 0, node_list);
        }
        return node_list;
    }

    public void search(TreeNode node, int level, List<List<Integer>> node_list){
        if(node != null){
            if(node_list.size() <= level){
                List<Integer> node_vals = new ArrayList<>();
                node_list.add(node_vals);
            }

            node_list.get(level).add(node.val);



            search(node.left, level + 1, node_list);
            search(node.right, level + 1, node_list);
        } 
    }
}
