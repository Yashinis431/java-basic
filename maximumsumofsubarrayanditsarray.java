import java.util.*;
class maximumsumofsubarrayanditsarray{
    public static void main(String[] args){
    int[] arr={-2,1,-3,4,-1,2,1,-5,9};
    int max=0;int sum=0;int start=0;int end=0;int maxst=0;int sum2=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(sum>max){
            max=sum;
            maxst=start;
            end=i;
        }
        if(sum<0){
            sum=0;
            start=i+1;
        }
        
    }
    for(int i=start;i<=end;i++){
        if(arr[i]>0){                    //System.out.print(arr[i]);
             sum2+=arr[i];
        }
    }
    System.out.print(sum2+" ");
    System.out.print(max);
}
}