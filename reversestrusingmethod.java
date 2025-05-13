import java.util.*;
public class reversestrusingmethod {
    public static String rev(String s){
        String res ="";
        for(int i=s.length()-1;i>=0;i--){
            res +=s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String result=rev(s);
        System.out.print(result);
        sc.close();
    }

    
}
