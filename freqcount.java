import java.util.*;
class freqcount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j]==arr[j+1]){
                    count++;
                }
                System.out.print(arr[i]+"-"+count);

            }
        }
    }
}