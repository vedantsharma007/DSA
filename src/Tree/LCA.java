package Tree;

public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q) return root;
        TreeNode left=lowestCommonAncestor(root.left, p, q);
        TreeNode right=lowestCommonAncestor(root.right, p, q);
        if(left==null) return right;
        else if(right==null) return left;
        else return root;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(9, null, null);
        TreeNode node = new TreeNode(15, null, null);
        TreeNode q = new TreeNode(7, null, null);

        TreeNode rightChild = new TreeNode(20, node, q);
        TreeNode root = new TreeNode(3, p, rightChild);

        LCA obj = new LCA();

        TreeNode result = obj.lowestCommonAncestor(root, p, q);
        System.out.print("Lowest Common Ancestor value is: " + result.val);
    }
}
