class Solution {
    List<Integer> ans = new ArrayList<>();

    void inOrder(TreeNode root){
        if(root == null) return ;
        inOrder(root.left);
        ans.add(root.val);
        inOrder(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        int temp = -1;
        if(root != null){
            inOrder(root);
            temp = ans.get(k-1);
        }
        return temp;
    }
}