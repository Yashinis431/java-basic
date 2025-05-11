import java.util.*;
public class dupele {
    public static void main(String[] args){
        String str="hello";
        String str1="";
        for(int i=0;i<str.length();i++){
            String s = String.valueOf(str.charAt(i));
            if(!str1.contains(s)){
                str1+=str.charAt(i);
            }
            
        }
        System.out.print(str1);


    }
    
}
