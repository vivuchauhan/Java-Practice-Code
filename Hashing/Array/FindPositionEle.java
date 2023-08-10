package Array;

public class FindPositionEle {
    public static void main(String[] args) {
        int a[]={10,50,70,5,9,100,9,45,9};
        int n=a.length;
        int x=9;
        boolean found=false;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                System.out.println("element found at index ->"+i);
                found=true;
            }
        }
        if(found==false){
            System.out.println("element not found");
        }
    }
}
