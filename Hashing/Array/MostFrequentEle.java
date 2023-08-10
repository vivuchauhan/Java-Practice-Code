package Array;
import java.util.*;
import java.util.Map.Entry;
public class MostFrequentEle {
    static int mostFrequent(int arr[], int n) {
        // Insert all elements in hash
        Map<Integer, Integer> hp =
                new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            int key = arr[i];
            if(hp.containsKey(key)){
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            } else {
                hp.put(key, 1);
            }}
        // find max frequency.
        int max_count = 0, res = -1;
        for(Entry<Integer, Integer> val : hp.entrySet()){
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 40,50,30,40,50,30,30};
        int n = arr.length;
        System.out.println(mostFrequent(arr, n));
    }
//    static int mostFrequent(int arr[], int n) {
//        //O(nlogn) spaceO(1)
//        Arrays.sort(arr);
//        // find the max frequency using linear traversal
//        int max_count = 1, res = arr[0];
//        int curr_count = 1;
//        for (int i = 1; i < n; i++) {
//            if (arr[i] == arr[i - 1])
//                curr_count++;
//            else
//                curr_count = 1;
//            if (curr_count > max_count) {
//                max_count = curr_count;
//                res = arr[i - 1];
//            }
//        }
//        return res;
//    }
}
