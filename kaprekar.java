import java.util.*;
class kaprekar{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int digit=String.valueOf(n).length();
            int ans=n*n;
            int l=ans/(int)Math.pow(10,digit);
            int r=ans%(int)Math.pow(10,digit);;
            System.out.println(l+r==n?"Yes":"No");
        }
}