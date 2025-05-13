import java.util.*;
public class samenumber {
    public static String sameornot(int n,int n1){
            if((n^n1)==0){
                return "same";
            }
            else{
                return "not same";
            }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        System.out.print(sameornot(n,n1));
        
        

    }

    
}
