import java.util.*;
class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    if(k<j){
                        System.out.print(",");
                    }
                }
                System.out.print("]");
            }
        }
    }
}