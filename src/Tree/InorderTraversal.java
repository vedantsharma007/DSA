package Tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        dfs(root,list);
        return list;
    }
    public void dfs(TreeNode root,List<Integer> list){
        if(root==null) return ;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }

    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        InorderTraversal obj=new InorderTraversal();
        List<Integer> list=obj.inorderTraversal(root);

        System.out.println("Inorder Traversal is: ");
        for(Integer i: list){
            System.out.print(i+" ");
        }
    }
}
