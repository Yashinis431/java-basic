import java.util.*;
public class fibonaciusingrecursion {
    public static void print(int[] arr,int index){ 
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        print(arr,index+1);

    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        print(arr,0);
    }
}
