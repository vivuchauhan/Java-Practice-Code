package Linkedlist;
public class PrintListAndLength {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }}
    public void add(int newdata){
        Node newnode= new Node(newdata);
        if(head==null){
            head= newnode;
        }
        else{
            Node temp= head;
            while(temp.next!=null){
                temp= temp.next;
            }
            temp.next= newnode;
        }}
    public void deleteNode(int position) {
        if (head == null)
            return;
        Node temp = head;
        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }
        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
    }
    public void printlist(){
        int len=0;
        if(head==null){
            System.out.print("no list");
        }else{
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                len= len+1;
                temp= temp.next;
            }}
        System.out.println(":  length of list is->"+len);
    }
    public static void main(String[] args) {
        PrintListAndLength list= new PrintListAndLength();
        list.add(10);
        list.add(120);
        list.add(60);
        list.add(0);
        list.add(100);

        list.printlist();
        list.deleteNode(2);
        list.printlist();
    }
}
