package Tree;

public class countLeafNodes {
    public int countLeaf(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return countLeaf(root.left)+ countLeaf(root.right);
    }
    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        countLeafNodes obj = new countLeafNodes();
        int depth = obj.countLeaf(root);

        System.out.println("no.of leaf nodes in the tree is: " + depth);
    }
}
