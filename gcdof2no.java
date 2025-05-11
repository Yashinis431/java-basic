import java.util.*;
public class gcdof2no {
    public static int gcd(int n1,int n2){
        if(n2==0) return n1;
        return gcd(n2,n1%n2);  

    }
    public static void main(String[] arg){
        int n1 = 92;
        int n2 = 0;
        System.out.print(gcd(n1,n2));
    }
    
}
