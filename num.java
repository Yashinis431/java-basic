import java.util.*;
class num{ 
    public static void main( String [] args){
        Scanner sc = new Scanner (System.in);
        char ch = sc.next().charAt(0);
        if (ch>='a'&& ch<='z') 
        {
            System.out.print("lowercase");
            }
        else if (ch>='A'&& ch<='Z') 
        {
            System.out.print("lowercase");
            }
        else if (ch>='0'&& ch<='9')
        {
            System.out.print("number");
            }
        else
        {
            System.out.print("invalid");
        }
        
    }
}