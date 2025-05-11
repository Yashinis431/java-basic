import java.util.*;
public class concatstrusingindex {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 =sc.nextLine();
    String s2=sc.nextLine();
    String s="";
    int i=0;int j=0;
    while(i<s1.length()&&j<s2.length()){
        s += s1.charAt(i);
        s+=s2.charAt(j);
        i++;
        j++;
    }
    System.out.print(s);
}

    
}
