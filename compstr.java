import java.util.*;
class compstr{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<vowel.length;j++){
                char ch=s.charAt(i);
                char v=vowel[j];
                if (ch==v){
                    count++;
                }
            }
            
        }
        System.out.print(count);

    }
}
    

