package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSinTree {
    public void bfs(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode top=q.poll();
                System.out.print(top.val+" ");
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
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
