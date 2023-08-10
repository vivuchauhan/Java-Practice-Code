package Practice;

import java.util.*;

public class CountNumbers {
    public static void main(String[] args) {
        int positive=0,negative=0,zeros=0;
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        while(input==1){
            int number=sc.nextInt();
            if(number>0){
                positive++;
            }else if(number<0){
                negative++;
            }else{
                zeros++;
            }
            input=sc.nextInt();
        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zeros);
    }
}
