import java.util.*;
class practice1{
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       int[] arr={1,2,3,4,5,6,7,8,9};
       int k=5;
       int n=arr.length;
       for(int i=0;i<n-k;i++){
           int[]  subarray = Arrays.copyOfRange(arr,i,i+k);
           System.out.println(Arrays.toString(subarray));
       }
    }
}
