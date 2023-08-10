package Practice;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4}; //[1,3]
        int ans[] = new int[2];
        int target = 6;

        //0,1,2,4

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 6) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ",");

        }
    }
}

