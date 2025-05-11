import java.util.*;
public class Innerfirstnonrepeat {
    public static void main(String[] args){
       int[] arr={1,1,2,2,2,3,4,4};
       int res=0;
       for(int i:arr){
        res ^=i;
       }
       System.out.println(res);

    }

    
}
