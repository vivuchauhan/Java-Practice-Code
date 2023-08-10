package Linkedlist;
public class ReverseLinkedlist {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }}
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
    public void printList() {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void reverseList() {
        if(head == null || head.next == null) {
            return;}
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;}
        head.next = null;
        head = prevNode;}
    private Node reverseListRecursive(Node head) {
        //empty node || last node or only one node
        if(head == null || head.next == null) {
            return head;}
       Node newHead = (head.next);
        head.next.next = head;
        head.next = null;
        return newHead;}
    public static void main(String[] args) {
        ReverseLinkedlist list = new ReverseLinkedlist();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        list.reverseList();
        list.printList();
    }
}
