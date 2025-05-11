import java.util.*;
public class minimum_number_of_swaps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int onecount=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                onecount++;
            }
        }
        for(int i=0;i<onecount;i++){
            if(arr[i-])
        }
    }
    
}
/*import java.util.*;

public class MinSwapsSlidingWindow {
    public static int minSwapsToGroupOnes(int[] arr) {
        int n = arr.length;

        // Step 1: Count total number of 1s in the array
        int totalOnes = 0;
        for (int num : arr) {
            if (num == 1) totalOnes++;
        }

        // Edge case: If no 1s or all 1s, no swaps needed
        if (totalOnes == 0 || totalOnes == n) return 0;

        // Step 2: Count number of 1s in the first window of size 'totalOnes'
        int currOnes = 0;
        for (int i = 0; i < totalOnes; i++) {
            if (arr[i] == 1) currOnes++;
        }

        int maxOnesInWindow = currOnes;

        // Step 3: Slide the window
        for (int i = totalOnes; i < n; i++) {
            // Remove element going out
            if (arr[i - totalOnes] == 1) currOnes--;
            // Add element coming in
            if (arr[i] == 1) currOnes++;

            // Update maximum 1s in any window
            maxOnesInWindow = Math.max(maxOnesInWindow, currOnes);
        }

        // Step 4: Minimum swaps = totalOnes - maxOnesInWindow
        return totalOnes - maxOnesInWindow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = minSwapsToGroupOnes(arr);
        System.out.println("Minimum number of swaps to group all ones together: " + result);
    }
}
 */
