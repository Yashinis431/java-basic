import java.util.*;
public class dense {
    public static boolean isDense(int[][] arr,int n,int m){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                      count++;
                }
            }
        }
        if(count>(n*m)/2){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(isDense(arr,n,m));
    }
    
}
