import java.util.*;
class pro{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int e = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int g = sc.nextInt();
        int avg = (t+e+m+d+g)/5;
        System.out.println(avg);
        if (avg%t==0)
        {
            System.out.println("yes");
        }
        else{
                System.out.println("no");
            }
        
        

    }
}