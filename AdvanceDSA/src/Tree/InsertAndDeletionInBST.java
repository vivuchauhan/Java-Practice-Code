package Tree;

public class InsertAndDeletionInBST {
   static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    public static Node insertInBST(Node root,int data){
        if (root == null) {
            root= new Node(data);
            return root;
        }
        else if (data < root.data)
            root.left = insertInBST(root.left, data);
        else if (data > root.data)
            root.right = insertInBST(root.right, data);

        return root;
    }
    public static Node deleteInBST(Node root, int value){
        if (root == null)
            return root;
        if (root.data > value){
            root.left = deleteInBST(root.left, value);
            return root;
        }
        else if (root.data < value){
            root.right = deleteInBST(root.right, value);
            return root;
        }
        if (root.left == null){
            Node temp = root.right;
            return temp;
        }
        else if (root.right == null){
            Node temp = root.left;
            return temp;
        }
        else{
            Node succParent = root;
            Node succ = root.right;
            while (succ.left != null){
                succParent = succ;
                succ = succ.left;
            }
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;
            root.data = succ.data;
            return root;
        }
    }

    public static void main(String[] args) {
        Node root = null;
//        root = insert(root, 50);
//        root = insert(root, 30);
//        root = insert(root, 20);
//        root = insert(root, 40);
//        root = insert(root, 70);
//        root = insert(root, 60);
//        root = insert(root, 80);
//        System.out.println("\nDelete 50\n");
//        root = deleteInBST(root, 50);
        System.out.println(root);
    }
}
