import java.util.*;
public class phoneno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long n=sc.nextLong();
        int n1=0;
        boolean flag=false;
        while(n!=0){
            int a=(int)(n%10);
            if(a==n1){
               flag=true;
               System.out.print("Suspicious");
               break;
            }
            n1=a;
            n/=n;

        }
        if(!flag){
            System.out.println("Safe");
        }
    }
    
}
