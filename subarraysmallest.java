import java.util.*;
public class subarraysmallest {
    public static void main(String[] args){
        int s=11;
        int min=Integer.MAX_VALUE;
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int count=0;
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    count++;
                }
               
                if(sum>=s){
                    if(count<min){
                        min=count;
                    }
                   
                }
               
            }
            
        }
        if(min==Integer.MAX_VALUE){
            System.out.print("No valid subarray found");
        }
        else{
            System.out.print(min);
        }
    }
    
}
/*for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){ */ //for print sub array