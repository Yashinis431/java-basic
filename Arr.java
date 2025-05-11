import java.util.*;
public class Arr{
    public double SortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m =nums2.length;
        int sum=0;
        int[] arr=new int[n+m];
        sum = n+m;
        int[] nums3 = mergeArraysUsingArrayList(nums1,nums2);
        if((n+m)%2!=0){
            return (double)nums3[n/2];
        }
        else{
            return (double)nums3[(n+(n+1))/2];
        }
       
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] nums1={1,3};
        int[] nums2={2};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}