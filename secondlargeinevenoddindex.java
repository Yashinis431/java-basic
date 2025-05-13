import java.util.*;
public class secondlargeinevenoddindex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List <Integer> odd=new ArrayList <>();
        List <Integer> even=new ArrayList <>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.print()
    }
}
