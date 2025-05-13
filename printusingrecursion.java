import java.util.*;
public class printusingrecursion {
    public static void print(int n){
        if(n<5){
            System.out.println(n);
            print(n+1);
        }
    }
    public static void main(String[] args){
        int n=1;
        print(n);

      
    }
    
}
