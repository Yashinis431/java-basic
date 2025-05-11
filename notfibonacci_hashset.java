import java.util.*;
public class notfibonacci_hashset {
    public static Set<Integer> getfib(int n){
        int a=0;
        int b=1;
        Set<Integer> fibset=new HashSet<>();
        while(a<=n){
        fibset.add(a);
        int temp=a+b;
        a=b;
        b=temp;
        }
        return fibset;
    }
    public static void printnum(int n){
        Set<Integer> fibset=getfib(n);
        for(int i=1;i<=n;i++){
            if(!fibset.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printnum(n);
    }
    
}
