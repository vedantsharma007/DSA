package Tree;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode swap=root.left;
        root.left=root.right;
        root.right=swap;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        InvertTree obj= new InvertTree();
        obj.invertTree(root);

    }
}
