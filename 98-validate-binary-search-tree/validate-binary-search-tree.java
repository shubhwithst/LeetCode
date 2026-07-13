class Solution {
    List<Integer> lst = new ArrayList<>();

    List<Integer> inOrder(TreeNode root) {
        if (root == null)
            return null;
        inOrder(root.left);
        lst.add(root.val);
        inOrder(root.right);

        return lst;
    }

    public boolean isValidBST(TreeNode root) {
        if (root != null) {
            List<Integer> temp = inOrder(root);
            for (int x = 0; x < temp.size() - 1; x++) {
                if (temp.get(x) >= temp.get(x + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}