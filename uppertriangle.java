import java.util.*;
public class uppertriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        /*for(int i=0;i<n;i++){
            for(int j=0;j<m-i;j++){
                sum+=arr[i][j];
            }
        }*/
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i+j<=n-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.print(sum);
    }
    
}
