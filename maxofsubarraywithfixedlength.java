import java.util.*;
class  maxofsubarraywithfixedlength{
    public static void main(String[] args){
        int[] arr={4,5,9,7,8,2};
        int k=3;
        int wsum=0;int msum=0;
        for(int i=0;i<k;i++){
            wsum+=arr[i];
            msum=wsum;
        }
        for(int i=k;i<arr.length;i++){
            wsum=wsum+arr[i]-arr[i-k];
            if(wsum>msum){
                msum=wsum;
            }
        }
        System.out.println(msum);

    }
}