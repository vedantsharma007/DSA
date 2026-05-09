package Tree;

public class BalancedTree {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(Math.abs(maxDepth(root.left)-maxDepth(root.right))>1) return false;
        return (isBalanced(root.left) && isBalanced(root.right))?true:false;
    }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        BalancedTree obj=new BalancedTree();
        System.out.print("tree is balanced tree : "+obj.isBalanced(root));
    }
}
