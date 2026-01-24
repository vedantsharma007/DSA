package Tree;


// can be done easily by iterative approach .make queue ds ,count every level
//(BFS) when root.left==null and root.right==null return level +1
public class minHeightOfTree {
//    **************************************************************************************************
//    public int minHeight(TreeNode root){
//        Queue<TreeNode> q=new LinkedList<>();
//        if(root==null) return 0;
//        q.add(root);
//        int count=0;
//        while(!q.isEmpty()){
//            count++;
//
//            int size=q.size();
//            int i=0;
//            while(i<size){
//                TreeNode top=q.poll();
//                if(top.left==null && top.right==null) return count;
//                if(top.left!=null) q.add(top.left);
//                if(top.left!=null) q.add(top.left);
//                i++;
//
//            }
//        }
//        return count;
//    }
// ****************************************************************************************************************


//    RECURSION FUNCTION FOR THIS***********************************************************************************


    public int minHeight(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        if(root.left==null) return 1+ minHeight(root.right);
        if(root.right==null) return 1+ minHeight(root.left);
        return 1+Math.min(minHeight(root.left),minHeight(root.right));
    }
    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(9, null, null);
        TreeNode rightChild = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
        TreeNode root = new TreeNode(3, leftChild, rightChild);

        minHeightOfTree obj = new minHeightOfTree();
        int min = obj.minHeight(root);

        System.out.println("minimum height of the tree is: " + min);
    }
}
