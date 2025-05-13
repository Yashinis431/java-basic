import java.util.*;
class swapinx{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int a=2;
        int b=3;
        int temp=0;
        if(a<n&&b<n){
            temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;

        }
        else{
            System.out.println("invalid index");
        }
        System.out.print(Arrays.toString(arr) );
        //for(int i=0;i<n;i++){
           // System.out.print(arr[i]+" ");
       // }

    }
}