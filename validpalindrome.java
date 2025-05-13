import java.util.*;
public class validpalindrome {
    public static boolean ispalindrome(String s){
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        System.out.print(s);
        int st=0;
        int end=s.length()-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        String s="A man, a plan, a canal: Panama";
        boolean flag=ispalindrome(s);
        System.out.print(flag);

    }
    
}
