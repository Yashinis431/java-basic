import java.util.*;
public class sparsematrix {
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
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    count++;
                }
            }
        }
        int x=n*m-count;
        if(count>x){
            System.out.println("Sparse");
        }
        else{
            System.out.print("not sparse");
        }
        
    }
    
}
