import java.util.*;
public class swapusingbit {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    a=a^b;
    b=b^a;
    a=a^b;
    System.out.println(a);
    System.out.println(b);
    }

    
}
