import java.util.*;
class frequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int a=n%10;
        while (n<0){
            int rem=n%10;
            n/=10;
            if (a==rem){
                count++;
                System.out.print(rem+"-"+count);
            }

        }

    }
}