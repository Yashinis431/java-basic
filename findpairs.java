import java.util.*;
class findpairs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("target:");
        int target = sc.nextInt();
        System.out.println("size:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        int i,j;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }

        }
    }
}