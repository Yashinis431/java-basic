import java.util.*;  //Leetcode 941
public class mountain_array {
    public static void main(String[] args){
        int arr[]={1,2,3,2,1};
        System.out.print(ismountainarray(arr)?"bitonic":"no");
    }
    public static boolean ismountainarray(int[] arr){
           int n=arr.length;
           if(n<3) return false;
           int i=0;
           while(i+1<n&&arr[i]<arr[i+1]){
            i++;
           }
           if(i==0||i==n-1)  return false;
           while(i+1<n && arr[i]>arr[i+1]){
            i++;
           }
           return i==n-1;
    }
    
}
