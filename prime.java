import java.util.*;
class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int count = 0;
        for (int j=1;j<=n;j++){
             for(int i =1;i<=j; i++){
                if (n%i == 0){
                    count++;
                    if (count++){
                        System.out.print(j);
                    }
                      
                }
            }
        }
        if (count<=2){
            System.out.print("prime");
        }
        else {
            System.out.print("Not prime");
        }

            
        
    }
}