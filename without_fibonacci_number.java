import java.util.*;
public class without_fibonacci_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] fib=new int[100];
        fib[0]=0;
        fib[1]=1;
        int i=2;
        while(true){
            fib[i]=fib[i-1]+fib[i-2];
            if(fib[i]>n) break;
            i++;
        }
        for(int j=1;j<=n;j++){
            boolean flag=false;
             for(int k=0;k<i;k++){
                if(fib[k]==j){
                   flag=true;
                   break;
                }
            }
            if(!flag){
                System.out.print(j+" ");
            }
        }
        sc.close();

    }
    
}
