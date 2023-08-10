package Linkedlist;

public class PairWiseSwap {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void add(int newdata){
        Node newNode=new Node(newdata);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void printlist(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("null");
    }
    void pairWiseSwap(){
        Node temp = head;
        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) {
            int k = temp.data;/* Swap the data */
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }}
     void PairWiseSwap(){
        if (head == null || head.next == null) {
            return;
        } // Initialize previous and current pointers
        Node prev = head;
        Node curr = head.next;
         head = curr; // Change head before proceeding
        while (true) {// Traverse the list
            Node next = curr.next;
            curr.next = prev; // Change next of current as previous node
            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }// Change next of previous to next next
            prev.next = next.next;
            // Update previous and curr
            prev = next;
            curr = prev.next;
        }
        return;
    }
    public static void main(String[] args) {
        PairWiseSwap list=new PairWiseSwap();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printlist();
        System.out.println();
        list.PairWiseSwap();
       // list.pairWiseSwap();
        list.printlist();
    }
}
