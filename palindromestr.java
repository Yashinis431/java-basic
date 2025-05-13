import java.util.*;
class palindromestr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String a="";
        for(int i=s.length()-1;i>=0;i--){
            a += s.charAt(i);

        }
        if (s.equals(a)){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not palindrome");
        }

    }
}
