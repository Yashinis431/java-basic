import java.util.*;
public class Innerremove_duplicate_from_sorted_array_26 {
    public static void main(String[] args){
        int[] arr={0,0,1,1,1,2,2,2,2};
        int j=1;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(j);
    }

    
}

