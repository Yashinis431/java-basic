import java.util.*;
class seclarge{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int max1=0;
    int max2 =0;

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        if (arr[i]>max1){
            max1=arr[i];
        }
    }
    for(int i=0;i<n;i++){
        if(arr[i]<max1 && arr[i]>max2){
            max2=arr[i];

        }
    }
    System.out.print(max2);
    

}
}