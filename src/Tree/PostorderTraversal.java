package Tree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
        return list;
    }
    public void dfs(TreeNode root,List<Integer> list){
        if(root==null) return ;
        dfs(root.left,list);
        dfs(root.right,list);
        list.add(root.val);
    }
    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        PostorderTraversal obj= new PostorderTraversal();
        List<Integer> list=obj.postorderTraversal(root);

        System.out.println("postorder Traversal is: ");
        for(Integer i: list){
            System.out.print(i+" ");
        }
    }
}
