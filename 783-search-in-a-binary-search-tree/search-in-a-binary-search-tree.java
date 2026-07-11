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
    public TreeNode searchBST(TreeNode root, int val2) {
        if (root == null)
            return null;
        if (root.val == val2)
            return root;
        else if (root.val > val2) {
            return searchBST(root.left, val2);
        } else {
            return searchBST(root.right, val2);
        }
    }
}