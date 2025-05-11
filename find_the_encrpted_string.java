import java.util.*;
public class find_the_encrpted_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        char[] ch=s.toCharArray();
        int n=ch.length;
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=ch[(i+k)%n];
        }
        System.out.print(new String(arr)); 
        /*int n=s.length();
         * k=k%n;
         * return (s+s).subString(k,k+n);
         */
    }
    
}
