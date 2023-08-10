package Array;

public class PalindromePairs {
    static int palindromepair(int N, String arr[]){
        // code here
        String temp;
        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if(isPalindrome(arr[i] + arr[j])) return 1;
                if(isPalindrome(arr[j] + arr[i])) return 1;
            }
        }
        return 0;
    }
    static boolean isPalindrome(String s) {
        int n = s.length();
        for(int i=0; i< (n/2); i++) {
            if(s.charAt(i)!=s.charAt(n-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int N = 6;
        String arr[] = {"geekf", "geeks", "or","keeg", "abc","bc"};
        System.out.println(palindromepair(N,arr));
    }
}