import java.util.*;
public class stringprintinxpattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;i){
                if(i==j||i+j==n-1){
                 System.out.print(s.charAt(index));
                }
           }
           index++;
        }

    }
}
