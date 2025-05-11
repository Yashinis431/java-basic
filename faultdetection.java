import java.util.*;
public class faultdetection {
    public static void main(String[] args){
       int[] arr={50,52,51,49,50,90,53,95};
       int x=0;
       for(int i=0;i<5;i++){
          x+=arr[i];
       }
       
       int avg=x/5;
       List<Integer> list=new ArrayList<>();
       for(int i=5;i<arr.length;i++){
         if((arr[i]-avg)>20){
            list.add(i);
        }
       }
       System.out.print(list);

    }
    
}
