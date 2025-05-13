import java.util.*;
public class xor0f1 {
    public static int operation(int n){
    if(n%4==0) return n;
    if(n%4==1) return 1;
    if(n%4==2) return n+1;
    
    return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        System.out.print(operation(s));
    }

    
    
}
