import java.util.*;
public class redgreen {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();       
        }
        String s=sc.next();
        sc.close();
        for(int i=0;i<n;i++){
            if(arr[i]==1&&s.charAt(i)=='R'){
                System.out.println("player "+(i+1)+" Eliminated");
            }
            else{
                System.out.println("player "+(i+1)+" Survive");
            }
        }
    }
}
