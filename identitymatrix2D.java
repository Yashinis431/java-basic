import java.util.*;
public class identitymatrix2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int column = sc.nextInt();
        int[][] arr=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean check=false;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i==j){
                    if(arr[i][j]==1){
                        check=true;
                    }
                    else break;
                }
                else{
                    if(arr[i][j]==0){
                       check=true;
                    }
                    else{
                       check=false;
                       break;
                    }
                }
                
            }
            
        }
        if(check==true){
            System.out.println("identity matrix");
        }
        else{
            System.out.println("Not");
        }
       
    }
    
}
