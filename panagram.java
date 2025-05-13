import java.util.*;
public class panagram {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s="the quick brown fox jumps over the lazy dog";
        String res= "";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&& c<='z'){
                if((!res.contains(String.valueOf(c)))){
                    res +=c;
                }
            }
        }
        if (res.length()==26){
            System.out.print("panagram");
        }
        else{
            System.out.print("not panagram");
        }
        
    }
    
}
