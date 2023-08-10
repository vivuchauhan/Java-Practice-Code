package Practice;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10,b=20;
//        int temp=a;
//        a=b;
//        b=temp;

        //without using third variable
        a=a+b;  //30
        b=a-b;  //30-20=10
        a=a-b;  //30-10=20
        System.out.println("a"+a);
        System.out.println("b"+b);
    }
}
