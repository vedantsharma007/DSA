package Tree;

import java.util.Stack;

//Inorder dfs

public class DFSinTree {
    public void dfs(TreeNode root){
        if(root==null) return ;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode top=st.pop();
            System.out.print(top.val+" ");

            if(top.right!=null) st.push(top.right);
            if(top.left!=null) st.push(top.left);
        }
    }

    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        BFSinTree obj=new BFSinTree();
        obj.bfs(root);

    }
}
