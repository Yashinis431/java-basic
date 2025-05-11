import java.util.*;
public class arrchgindex {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int num=0;
        for(int i=0;i<n;i++){          // o/p 2 3 4 1 2    o/p 10 9 8 11 10 
            //10 9 8 11 10 
            sum += arr[i];
        }
        for(int i=0;i<n;i++){
            num=sum-arr[i];   //print(sum-arr[i]," ") o/p not store in array
            arr[i]=num;
            System.out.print(arr[i]+" ");
            
        }
        //System.out.println();
        //System.out.println(Arrays.toString(arr));
    }
        
    
}
