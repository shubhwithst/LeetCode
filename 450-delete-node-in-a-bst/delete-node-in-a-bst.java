class Solution {
    TreeNode succ(TreeNode root){
        TreeNode temp = root.right;
        while(temp != null && temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }else if(root.val < key){
            root.right = deleteNode(root.right, key);
        } else{
            if(root.left == null){ 
                return root.right;
            }else if(root.right == null){
                return root.left;
            } else{
                TreeNode getSucc = succ(root);
                root.val = getSucc.val;
                root.right = deleteNode(root.right,getSucc.val); 
            }
        
        }
        return root;
    }
}