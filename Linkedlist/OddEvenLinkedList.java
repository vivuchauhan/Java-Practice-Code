package Linkedlist;

public class OddEvenLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
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
    //Input: head = [1,2,3,4,5]
    //Output: [1,3,5,2,4] Time complexity : O(n) space O(1)
    public void oddEvenList() {
        if (head == null) return;
        Node odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return;
    }
    public static void main(String[] args) {
        OddEvenLinkedList list=new OddEvenLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        System.out.println("Given list");
        list.printlist();
        list.oddEvenList();
        System.out.println();
        System.out.println(  "odd Even List");
        list.printlist();
    }
}
