package Practice;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("*");
        int n=4;
        for(int i=3;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print("^");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
    }
}
