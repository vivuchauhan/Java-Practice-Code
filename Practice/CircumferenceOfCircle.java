package Practice;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static Double CircumferenceOfCircle(Double redius){
        return 2*3.14*redius;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double redius=sc.nextDouble();
        System.out.println(CircumferenceOfCircle(redius));
    }
}
