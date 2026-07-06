class Solution {
    private int dia;

    public int diameterOfBinaryTree(TreeNode root) {
        longestPath(root);
        return dia;
    }

    private int longestPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = longestPath(root.left);
        int right = longestPath(root.right);
        dia = Math.max(dia, right + left);
        return Math.max(left,right) + 1;
    }
}