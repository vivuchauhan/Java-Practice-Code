package Linkedlist;

public class InsertCircularList {
    Node head;
    class Node {
        Node next;
        int data;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void printlist(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("null");
    }
    public Node Insertion(Node head, int K) {
        Node newNode = new Node(K);
        // When the list is empty
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        Node ptr = head;
        // Move to the end of the list
        while (ptr.next != head) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
        newNode.next = head;
        return head;
    }
    public static void main(String[] args) {
        InsertCircularList list=new InsertCircularList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printlist();

    }
}
