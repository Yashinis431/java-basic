import java.util.*;
public class twosum_167 {
    public static int[] twosum(int[] arr,int target){
          int i=0;
          int j=arr.length-1;
          while(arr[i]+arr[j]!=target){
            if(arr[i]+arr[j]>target){
              j--;
            }
            else{
              i++;
            }
        }
        return new int[] {i+1,j+1};

    }
    public static void main(String[] args){
        int[] arr={2,7,11,15};
        int target=9;
        System.out.print(Arrays.toString(twosum(arr,target)));
    }
    
}
