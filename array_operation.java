import java.util.*;
public class array_operation {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        //delete
        int target=3;
        for(int i=0;i<n;i++){
           if(arr[i]==target){
              arr[i]=0;
           }
        }
        System.out.print(Arrays.toString(arr));
    }
}
