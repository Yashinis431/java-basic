import java.util.*;
public class sumandproduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum +=(Character.getNumericValue(s.charAt(i))*Character.getNumericValue(s.charAt(i+1)));
        }
        System.out.print(sum);

    }
    
}
