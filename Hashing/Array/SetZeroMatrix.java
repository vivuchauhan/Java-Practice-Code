package Array;
import java.util.ArrayList;
public class SetZeroMatrix {
    //Output: [[1,0,1],[0,0,0],[1,0,1]]
    public static int[][] setZeroes(int[][] matrix) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    l1.add(i);
                    l2.add(j);
                }}}
        for(int i:l1){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }}
        for(int i:l2){
            for(int j=0;j<matrix.length;j++){
                matrix[j][i]=0;
            }}
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
       // setZeroes(matrix);
       int arr[][]= setZeroes(matrix);
       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++){
               System.out.print(arr[i][j]+" ");
           }
       }
    }
}
