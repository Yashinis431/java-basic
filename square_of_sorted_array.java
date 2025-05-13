import java.util.*;
public class square_of_sorted_array {
    public static void main(String[] args){
        int[] arr={-4,-1,0,3,10};
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=arr[i]*arr[i];
        // }
        // Arrays.sort(arr);
        // System.out.print(Arrays.toString(arr));   
        int n=arr.length;
        int[] res=new int[n];
        int i=0;
        int j=arr.length-1;
        for(int k=n-1;k>=0;k--){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                res[k]=arr[i]*arr[i];
                i++;
            }
            else{
                res[k]=arr[j]*arr[j];
                j--;
            }
            
        }
        System.out.print(Arrays.toString(res));

    }
    
}
