package Linkedlist;

import java.util.LinkedList;

public class FindLength {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("V"+"->");
        list.add("i");
        list.add("v");
        list.add("e");
        list.add("k");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.add(4,null);
        System.out.println(list);
        System.out.println(list.size());
    }
}