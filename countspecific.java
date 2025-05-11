import java.util.*;
class countspecific{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(ch==ch1){
                count++;
            }
        }
        System.out.print(count);

    }
}
