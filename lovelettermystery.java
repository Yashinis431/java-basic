import java.util.*;
class lovelettermystery{
    public static int letter(String s){
        int x=s.length();
        int st=0;
        int end=x-1;
        int count=0;
        while(st<end){
            count+=Math.abs(s.charAt(st)-s.charAt(end));
            st++; 
            end--;
        }
        return count;
    }
    public static void main(String[] args){
        String s="abba";
        int n=letter(s);
        System.out.print(n);

    }
}