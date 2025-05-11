import java.util.*;
public class left_right_rotation {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){   
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%n;
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[(i+k)%n]=arr[i];
        }
        System.out.print(Arrays.toString(arr1));
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=arr[(i+k)%n];
        }
        System.out.print(Arrays.toString(arr2));
    }
    
}
