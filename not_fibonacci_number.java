import java.util.*;
public class not_fibonacci_number {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        int n1=0;
        int n2=1;
        int sum=0;
        int i=0;
        while(n1<=20){
            s+=n1;
            sum=n1+n2;
            n1=n2;
            n2=sum;
            i++;
        }
        for(int j=0;j<=n;j++){
              if(!s.contains(String.valueOf(j))){
                System.out.print(j+" ");
              }
             
        }

    }
}
