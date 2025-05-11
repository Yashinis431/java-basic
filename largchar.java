import java.util.*;
class largchar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int max = 0;
        for(int i=0;i<s.length();i++ ){
        if(s.charAt(i)>max){
           max = s.charAt(i); 
        }
        }
        char m = (char) max;
        System.out.println(m);
    }
}
