import java.util.*;
public class rightRotate{
    public static void main(String[] arhs){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int k = sc.nextInt();
        int n = arr.length;
        k = k%arr.length;

        

        for(int i = 0 , j= n-1 ; i < j ;i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
        }
        
        for(int i = 0 , j= k-1 ; i < j ;i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
        }

        for(int i = k , j= n-1 ; i < j ;i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
        }
        
           
        //left na 1st k ele reverese,then nxt remaining ele,then whole a reverse

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
