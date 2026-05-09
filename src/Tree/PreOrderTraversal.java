package Tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
        return list;
    }
    public void dfs(TreeNode root,List<Integer> list){
        if(root==null) return ;
        list.add(root.val);
        dfs(root.left,list);
        dfs(root.right,list);
    }
    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        PreOrderTraversal obj= new PreOrderTraversal();
        List<Integer> list=obj.preorderTraversal(root);

        System.out.println("preorder Traversal is: ");
        for(Integer i: list){
            System.out.print(i+" ");
        }
    }
}
