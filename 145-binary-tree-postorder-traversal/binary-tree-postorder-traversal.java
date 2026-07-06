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
    private static List<Integer> answer;

    private static void postorder(TreeNode root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            answer.add(root.val);
        }
    }


    public List<Integer> postorderTraversal(TreeNode root) {
        answer = new ArrayList<Integer>();
        postorder(root);
        return answer;
        
    }
}