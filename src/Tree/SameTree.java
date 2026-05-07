package Tree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode p = new TreeNode(3, leftChild, rightChild);

        TreeNode leftc = new TreeNode(9, null, null);
        TreeNode rightc = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode q = new TreeNode(3, leftc, rightc);

        SameTree obj= new SameTree();
        System.out.print("Are they same trees: "+obj.isSameTree(p,q));

    }
}
