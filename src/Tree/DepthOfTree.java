package Tree;



public class DepthOfTree {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        DepthOfTree obj = new DepthOfTree();
        int depth = obj.maxDepth(root);

        System.out.println("The maximum depth of the tree is: " + depth);
    }
}
