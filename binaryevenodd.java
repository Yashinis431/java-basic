import java.net.SocketPermission;
import java.util.*;
public class binaryevenodd {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    if((n&1)==1){
        System.out.print("odd");
    }
    else{
        System.out.println("even");
    }
}
    
}
