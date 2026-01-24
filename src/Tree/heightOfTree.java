package Tree;

public class heightOfTree {
    public int height(TreeNode root){
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        heightOfTree obj = new heightOfTree();
        int height = obj.height(root);

        System.out.println("Height of the tree is: " + height);
        //can be done also by BFS
    }
}
