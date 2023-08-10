package Hashing;

import java.util.HashSet;
public class RepeatedInThreeArray { //O(n1 + n2) space O(maximum element in array)
    public static void findCommon(int a[], int b[], int c[], int n1, int n2,int n3) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < n2; i++) {
            set2.add(b[i]);
        }
        // checking if elements of 3rd array are present in first 2 sets
        for (int i = 0; i < n3; i++) {
            if (set.contains(c[i]) && set2.contains(c[i])) {
                // using a 3rd set to prevent duplicates
                if (set3.contains(c[i]) == false)
                    System.out.print(c[i]+" ");
                set3.add(c[i]);
            }
        }
    }
    public static void main(String args[]){
        int a[] = { 1, 5, 10, 20,70, 40, 80 };
        int b[] = { 6, 7, 20,70, 80, 100 };
        int c[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
        int n1 = a.length;
        int n2 = b.length;
        int n3 = c.length;
        System.out.println("Common Elements are ");
        findCommon(a, b, c, n1, n2, n3);
    }
}
