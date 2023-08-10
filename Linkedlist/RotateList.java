package Linkedlist;

public class RotateList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void addLast(int val) {
        Node newNode = new Node(val);
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
     void rotate(int k){
        if (k == 0)
            return;
        Node current = head;
        int count = 1;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }
        if (current == null)
            return;
        Node kthNode = current;
        while (current.next != null)
            current = current.next;
        current.next = head;
        head = kthNode.next;
        kthNode.next = null;
    }
    public static void main(String[] args) {
        RotateList head=new RotateList();
        for (int i = 1; i <= 5; i += 1)
            head.addLast(i);
        System.out.println("Given list");
        head.printlist();
        head.rotate(2);
        System.out.println();
        System.out.println(  "Rotated Linked List");
        head.printlist();
    }
}
