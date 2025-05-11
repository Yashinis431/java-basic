import java.util.*;
public class maximum_subarray {
    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(1,-2,4,6,-3,6,7,1);
        System.out.print(maxSubarray(arr));
        
    }
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSubarray = arr.get(0);
        int current = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            int num = arr.get(i);
            current = Math.max(num, current + num);
            maxSubarray = Math.max(maxSubarray, current);
        }
        // Max Subsequence
        int maxSubsequence = Integer.MIN_VALUE;
        int sumPositives = 0;
        for (int num : arr) {
            if (num > 0) {
                sumPositives += num;
            }
            maxSubsequence = Math.max(maxSubsequence, num);
        }

        if (sumPositives > 0) {
            maxSubsequence = sumPositives;
        }
        List<Integer> mylist=new ArrayList<>();
        mylist.add(maxSubarray);
        mylist.add(maxSubsequence);

    return mylist ;
    }
  }
    
}
