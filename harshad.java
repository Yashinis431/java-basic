import java.util.*;
class harshad{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int a = 0;
        while (n>0){
            a+= n%10;
            n/=10;
        }
        if (original% a==0){
            System.out.println("its divide");
        }
        else{
            System.out.println("not divisible");
        }

    }
}