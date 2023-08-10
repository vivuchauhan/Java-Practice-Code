package Mock;

public class DSA3 {
    public static void main(String args[]) {
        int num=1;
        int sum=0;
        int count=0;
        while(num<=10){
            if(num%2==0){
                count++;
                sum=sum+num;
            }
            num++;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
