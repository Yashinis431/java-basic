import java.util.*;
public class a4 {
    public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    int max=arr[0];
    int sum=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            sum +=arr[j];
        }
        if(max<sum){
            max=sum;
            sum=0;
        }
        else{
            sum=0;
        }
    }
    System.out.print(max);
    }
    
}
