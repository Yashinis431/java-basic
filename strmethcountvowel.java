import java.util.*;
public class strmethcountvowel {
    public static int count(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isvowel(c)){
                count++;
            }
        }
        return count;
    }
    public static boolean isvowel(char c){
        c=(c>='A'&& c<='Z') ? (char)(c+32):c;
        return(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public static String remove(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!isvowel(c)){
                res +=c;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(count(s));
        System.out.println(remove(s));

    }
    
}
