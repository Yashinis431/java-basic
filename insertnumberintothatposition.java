import java.util.*;
public class insertnumberintothatposition {
    public static void main(String[] args){
        int[] arr1= {1,2,3,4,5};
        int n=arr1.length;
        int[] arr2=new int[arr1.length+1];
        int ele=6;
        int pos=2;
        int index=0;
        int i=0;
        while(n>0){
            if(index==pos){
                arr2[index++]=ele;
            }
            else{
                arr2[index++]=arr1[i];
            }
            i++;
        }
        for(int i=0;i<=n;i++){
            System.out.print(arr2+" ");
        }
    } //Arrays.toString(arr2)
}
