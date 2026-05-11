package Tree;

public class PathSum {
    public boolean path(TreeNode root,int target){
        if(root==null) return false;
        if(root.left==null && root.right==null) return target== root.val;
        target-= root.val;
        return path(root.left,target) || path(root.right,target);
    }

    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        PathSum obj=new PathSum();
        System.out.print("path exists equal to target sum: "+obj.path(root,30));
    }
}
