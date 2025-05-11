import java.util.*;
public class equlibrium_index {
    public static void main(String[] args) {
    int[] arr={2,3,-1,8,4};
    int left=0;
    int right=0;
    for(int i=0;i<arr.length;i++){
        if(i==0){
            left=0;
        }
        else{
          for(int j=i-1;j>i;j--){
            left+=arr[j];
        }
        if(i==arr.length-1){
            right=0;
        }
        else{
            for(int j=i+1;j<arr.length;j++){
                right+=arr[j];
            }
        }
        if(left==right){
            System.out.print(i);
        }
        left=0;
        right=0;

    }



}  
    }
}

