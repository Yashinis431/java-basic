import java.util.*;
public class powerusingrecursion {
    public static int power(int n,int x){
        if(x==0) return 1;
        return(n*power(n,x-1));

    }
    public static void main(String[] args){
        int n=2;
        int x=3;
        System.out.print(power(n,x));

    }
    
}
