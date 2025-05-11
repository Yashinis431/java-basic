import java.util.*;
public class mysteryrecursion {
    public static int mystery(int z,int n){
        if(n==z) return z;
        else if(n>z)
            return mystery(z,n-z);
        else return mystery(z-n,n);

    }
    public static void main(String[] args){
        int n=4;
        int z=6;
        System.out.print(mystery(z,n));
    }
    
}
