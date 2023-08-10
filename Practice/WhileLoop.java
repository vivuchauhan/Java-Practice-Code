package Practice;

public class WhileLoop {
    public static void main(String[] args) {
        //print num 1 to 20
//        int num=1;
//        while(num<=20){
//            System.out.print(num+" ");
//            num++;
//        }

        //print num 100 to 200

//        int num=100;
//        while(num<=200){
//            System.out.print(num+" ");
//            num=num+1;
//        }

        // Print all odd numbers between 1 to 10
        // 1 3 5 7 9 11
//        int num=1;
//        while(num<=10){
//                System.out.print(num+" ");
//                num=num+2;
//        }

        // Print all even numbers between 1 to 10
//        int num=2;
//        while (num<=100){
//            System.out.print(num+" ");
//            num=num+2;
//        }

        // Print numbers between 100 to 1 (inclusive both 100 and 1)
//        int num=100;
//        while(num>=1){
//            System.out.print(num+" ");
//            num--;
//        }

        // Compute sum of all numbers between 1 to 100
//        int CumputSum=0;
//        int num=1;
//        while(num<=100){
//            CumputSum=CumputSum+num;
//            num++;
//        }
//        System.out.println(CumputSum);//5050 right ans

        // Sum of all odd numbers between 100 to 200

        int num=100;
        int sum=0;
        // 101+103+105........
        while(num<=200){
            if(num%2==1){
                sum=sum+num;
            }
            num++;
        }
        System.out.println(sum);
    }
}
