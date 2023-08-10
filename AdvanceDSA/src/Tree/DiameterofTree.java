package Tree;

public class DiameterofTree {
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
    public static TreeInfo diameter2(TreeNode root) {//time colplexity O(n)
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.ht + right.ht + 1;
        int diam2 = left.diam;
        int diam3 = right.diam;

        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
    }
    public static void main(String[] args) {
        TreeNode root = buildTree();
        System.out.println(diameter2(root).diam);
        System.out.println();
    }
}
    class TreeInfo {
        int ht;
        int diam;
        TreeNode left, right;
        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
            left = right = null;
        }
    }
