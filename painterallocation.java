import java.util.*;
public class painterallocation {
    public static boolean ispossible(int[] arr,int a,int b,int threshold){
        int counter=1;
        int index=0;
        int temp_sum=0;
        int n=arr.length;
        while(counter<=a&&index<n){
            temp_sum=arr[index];
            if(temp_sum>threshold){
                counter++;
                temp_sum=arr[index];
            }
            index++;
        }
        if(counter<=a){
            return true;
        }
        else{
            return false;
        }

    }
    public static int min_painter_allocation(int[] arr,int a,int b){
        int low=0;
        int high=0;
        for(int i=0;i<arr.length;i++){
            high+=arr[i];
        }
        int mid;
        while(low<high){
            mid=low+(high-low)/2;
            if(ispossible(arr,a,b,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low*b;

    }
    public static void main(String[] args){
        int a=2;
        int b=1;
        int[] arr={10,20,30,40};
        int ans=min_painter_allocation(arr,a,b);
        System.out.println(ans);
    }
}
