import java.util.*;
public class returncapsvalue {
    public static String caps(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z'){  //if(c<97)
                res +=c;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(caps(s));
    }
    
}
