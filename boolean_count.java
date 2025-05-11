import java.util.*;
public class boolean_count {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr={1,2,3,2,4,3,2,2};
        int n=arr.length;
        int count=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            count=0;
          if(!visited[i]){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+":"+count);
        }
        }
    }
    
}
