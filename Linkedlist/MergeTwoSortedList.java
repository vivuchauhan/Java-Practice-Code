package Linkedlist;

public class MergeTwoSortedList {
        Node head;
        public void addToTheLast(Node node) {
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;
                temp.next = node;
            }
        }
        void printList() {
            System.out.println("Merged Linked List is:");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String args[]) {
            MergeTwoSortedList llist1 = new MergeTwoSortedList();
            MergeTwoSortedList llist2 = new MergeTwoSortedList();
            // Node head1 = new Node(5);
            llist1.addToTheLast(new Node(5));
            llist1.addToTheLast(new Node(10));
            llist1.addToTheLast(new Node(15));
            // Node head2 = new Node(2);
            llist2.addToTheLast(new Node(2));
            llist2.addToTheLast(new Node(3));
            llist2.addToTheLast(new Node(20));

            llist1.head = new Merge().sortedMerge(llist1.head,
                    llist2.head);
            llist1.printList();
        }
    }
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    class Merge {
        public Node sortedMerge(Node A, Node B) {
            if (A == null)
                return B;
            if (B == null)
                return A;
            if (A.data < B.data) {
                A.next = sortedMerge(A.next, B);
                return A;
            } else {
                B.next = sortedMerge(A, B.next);
                return B;
            }
        }
    }