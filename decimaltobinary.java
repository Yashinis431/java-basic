import java.util.*;
public class decimaltobinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s="";
        int i=0;
        int n=0;
        int x=0;
        string s1="";
        while(n<1){
            x=n%2;
            s +=x;
            n/=2;
        }
        for(int i=s.length()-1;i>0;i--){
            s1+=s.charAt(i);
           System.out.print(s1);
        }
       

      }  
}
