import java.util.*;
public class main1 {
    public static void main(String[] args){
        String s="I am yashini";
        String s1="yashini";
        String s2="yasHini";
        System.out.println(s.substring(2,4));
        System.out.println(s.contains("yash"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.replace('i','r'));
        String[] fruits=s.split(" ");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.startsWith("yas"));
        System.out.println(s1.endsWith("ini"));




    }
    
}
