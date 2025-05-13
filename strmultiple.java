import java.util.*;
public class strmultiple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2=sc.nextLine();
        
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        int res = a * b;
        
        
        System.out.print(String.valueOf(res));
    }
    
}
