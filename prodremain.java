import java.util.*;
class prodremain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        int prod;
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            num *= arr[i];
        }
        for(int i=0;i<n;i++){
            prod=num/arr[i];
            System.out.println(prod);
        }

    }
}