package Tree;

public class countLeafNodes {
   public static int CountLeafNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        else if(root.left == null
                && root.right==null){
            return 1;
        }
        else{
            return CountLeafNodes(root.left)
                    + CountLeafNodes(root.right);
        }
    }

    public static void main(String[] args) {

    }
}
class TreeNode {
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
