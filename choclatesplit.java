import java.util.*;
public class choclatesplit {
    public static void main(String[] main){
    int d=5;
    int m=3;
    int[] arr={2,2,1,3,2};
    int n=arr.length;
    int sum=0;
    int count=0;
    for(int j=0;j<n-m+1;j++){
        sum=0;
        for(int i=j;i<j+m;i++){
            sum+=arr[i];
        }
        if(sum==d){
            count++;
        }
    }
    System.out.print(count);
}
}
