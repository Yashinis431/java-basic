import java.util.*;
public class accountno {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String s=String.valueOf(n);
      int sum=0;
      for(int i=0;i<s.length();i++){
        sum +=Character.getNumericValue(s.charAt(i));
        
       }
      int res1=Character.getNumericValue(s.charAt(s.length()-1));
      int res=sum%10;
      if(res==res1){
        System.out.print("Verified");
      }
      else{
        System.out.println("review");
      }
    }
    
    
}
