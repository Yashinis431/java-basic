import java.util.*;
public class countdown {
    public static void Blastcount(int n){
        if(n<=0){
            System.out.println("Blast off");
            return;
        }
        System.out.println(n);
        Blastcount(n-1);
    }
    public static void main(String[] args){
        int n=5;
        Blastcount(n);
    }
    
}
