package Tree;

public class DeleteNodeInBST {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static TreeNode deleteNode(TreeNode root, int val) {
        if (root == null)
            return root;
        if (val < root.val)
            root.left = deleteNode(root.left, val);
        else if (val > root.val)
            root.right = deleteNode(root.right, val);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.val = minValue(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }
    public static int minValue(TreeNode root){
        int minv = root.val;
        while (root.left != null) {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }
    public static void main(String[] args) {
        DeleteNodeInBST tree = new DeleteNodeInBST();
//        tree.insert(50);
//        tree.insert(30);
//        tree.insert(20);
//        tree.insert(40);

        System.out.println("\nDelete 50");

    //    tree.deleteNode(50);
        System.out.println(
                "Inorder traversal of the modified tree");
       // tree.inorder();
    }
}
