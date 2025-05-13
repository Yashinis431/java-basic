import java.util.*;
public class rotatestreql {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        int k=1;
        String temp="";
        for(int i=1;i<=n;i++){
            temp +=s1.charAt((i+k)%n);
            
        }
        if(s1.contains(temp)){
            System.out.print("equals");
        }
        else{
            System.out.print("not equals");
        }
    }
    
 
}
