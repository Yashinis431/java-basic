import java.util.*;
class diagonal{
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
        int ld=0;
        int rd=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                   ld+=arr[i][j];
                }
                if(i+j==n-1){
                    rd+=arr[i][j];
                }
            }
        }
        System.out.println(ld+" "+rd);
        System.out.println(Math.abs(ld-rd));
    }
}
