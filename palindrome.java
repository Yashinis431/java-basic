 import java.util.*;
    class reverse{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int original = n;
            int rev=0;
            int rem=0;
            while(n>0){
               rem= n%10;
               rev =rev*10+rem;
               n/=10;
            }
            if(original==rev){
                System.out.print("palindrome");
            }
            else{
                System.out.print("not palindrome");
            }
        }
    }
