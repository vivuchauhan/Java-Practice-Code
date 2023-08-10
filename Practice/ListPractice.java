package Practice;

public class ListPractice {
  Node head;
  class Node{
      int data;
      Node next;
      Node(int data){
          this.data=data;
          next=null;
      }
  }
  public void add(int newdata){
      Node newNode=new Node(newdata);
  }
    public static void main(String[] args) {
//        ListPractice list=new ListPractice();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.printlist();
    }
}
