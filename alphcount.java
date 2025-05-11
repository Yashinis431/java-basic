import java.util.*;
public class alphcount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1;
        String res="";
        int n=s.length()-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                res +=s.charAt(i);
                res +=count;
                count=1;
            }
            if(i+1==n){
                res +=s.charAt(i);
                res +=count;

            }
        }
        System.out.print(res);
    }
    
}
