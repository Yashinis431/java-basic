import java.util.*;
public class sumoffactorialofn {
    public static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
          
    }
    public static int sumoffact(int n){
        int sum=0;
        if(n==0) return 0;
        return (sum +=fact(n%10));
        n/=10;
    }
    public static void main(String[] args){
        int n=123;
        System.out.print(sumoffact(n));
         
    }
    
}
