package Tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return check(root.left,root.right);
    }
    public boolean check(TreeNode left,TreeNode right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.val!=right.val) return false;
        return check(left.left,right.right) && check(left.right,right.left);
    }
    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        SymmetricTree obj= new SymmetricTree();
        boolean ans=obj.isSymmetric(root);
        System.out.print("is tree symmetric: "+ ans);

    }
}
