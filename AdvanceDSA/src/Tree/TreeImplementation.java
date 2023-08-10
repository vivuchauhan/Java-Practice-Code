package Tree;
import java.util.*;
public class TreeImplementation {
    /**
     * This function builds the tree referred in the notes.
     */
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static TreeNode buildTree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(7);
        return root;
    }
    // NLR
    static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    // LRN
    static void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    // LNR
    static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode n = q.poll();
            System.out.print(n.data+" ");
            if(n.left!=null){
                q.offer(n.left);
            }
            if(n.right!=null){
                q.offer(n.right);
            }
        }
    }
    public static int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static int countOfNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }
    public static int sumOfNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }
    public static int diameter(TreeNode root) {//O(n^2)
        if(root == null) {
            return 0;
        }
        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);

        return Math.max(diam1, Math.max(diam2, diam3));
    }
    public static void main(String[] args) {
        TreeNode root = buildTree();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        height(root);
        System.out.println();
        countOfNodes(root);
        System.out.println();
        sumOfNodes(root);
        System.out.println();
        diameter(root);
        System.out.println();
    }
}
