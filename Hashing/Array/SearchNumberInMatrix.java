package Array;

import java.util.*;

public class SearchNumberInMatrix {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//
//        int[][] number=new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                number[i][j]=sc.nextInt();
//            }
//        }
//        int x=sc.nextInt();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(number[i][j]==x){
//                    System.out.println(number[i][j]);
//                }
//            }
//        }
        int[][] arr = {{3, 12, 9},
                {5, 2, 89},
                {90, 45, 22}};

        int x = 45; //output=2,1 index

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == x) {
                    System.out.println(i+","+j);
                }
            }
        }
    }
}