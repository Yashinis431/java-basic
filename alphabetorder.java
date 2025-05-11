import java.util.*;
public class alphabetorder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        String s1="";
        int min=(int)(s.charAt(0));
        while(n>0){
        for(int i=0;i<n-1;i++){
            if(min<s.charAt(i+1)){
                   min =(int)(s.charAt(i));
                }
            }
            if(!s1.contains(String.valueOf(min))){
                s1 +=String.valueOf(min);
            }
        }
        System.out.print(s1);
            
        
    }
    
}
