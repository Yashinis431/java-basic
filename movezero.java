import java.util.*;
class movezero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index++] = arr[i];
                arr[i]=0;
            }
        }
        System.out.println("array");
        for(int i=0;i<n;i++){
            
            System.out.println(arr[i]);
        }


    }
}