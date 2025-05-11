import java.util.*;
public class concatstr {
    public static String concatination(String s1, String s2){
        String res=s1+" "+s2;
        return res;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(concatination(s1,s2));
    }
    
}
