import java.util.*;
public class locker {
    public static void main(String[] args){
        Scanner sc = new Sca+nner(System.in);
        int n=sc.nextInt();
        String str=String.valueOf(n);
        int sum1=0;int sum2=0;
        int mid=str.length()/2;
        String s1=str.substring(0,mid);
        String s2=str.substring(mid);
        for(int i=0;i<mid;i++){
            sum1 +=Character.getNumericValue(s1.charAt(i));
            sum2 +=Character.getNumericValue(s2.charAt(i));
        }
        if(sum1==sum2){
            System.out.print("Valid");
        }
        else{
            System.out.println("Not Valid");
        }

    }
    
}
