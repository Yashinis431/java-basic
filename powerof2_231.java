import java.util.*;
public class powerof2_231 {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int n = 4; //to give binary  value as input 0b1000;
        // if((n&(n-1))==0){
        //     System.out.println("pow of 2");
        // }
        // else{
        //     System.out.println("not pow");
        // }
        System.out.print(n>0&&(Integer.bitCount(n)==1)?"Yes":"no");
        //System.out.print(n>0&&(n&(n-1))==0 ? "Yes":"no");
    }
    
}
