import java.util.*;
public class sumofrowandcolumn2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               arr[i][j]=sc.nextInt();
            }
        }
        int sum,sum1;
        for(int i=0;i<r;i++){
             sum=0;
             sum1=0;
            for(int j=0;j<c;j++){
               sum+=arr[i][j];
               sum1+=arr[j][i];
            }
            System.out.println(sum);
            System.out.println(sum1);
        }
        //for(int j=0;j<r;j++){
          //   sum=0;
           // for(int i=0;i<c;i++){
           //     sum+=arr[i][j];
           // }
           // System.out.println(sum);
       // }

        
    }
}
