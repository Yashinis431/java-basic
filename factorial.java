import java.util.*;
class factorial{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1;
        int fact = 1;
        while (i<=n){
            fact *= i ;
            i++;
            System.out.println(fact);
        }
        
    }
}