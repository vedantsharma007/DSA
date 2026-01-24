package Tree;

public class countNodes {

    //recursion
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        return countNodes(root.left) +  countNodes(root.right) + 1;
    }
    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        countNodes obj = new countNodes();
        int count = obj.countNodes(root);

        System.out.println("Number of nodes in the tree is: " + count);
    }
}
