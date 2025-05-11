import java.util.*;
class eo{
    public static void main( String[] args){
        int i=1;
        int even=0;
        int odd = 0;
        do{
            if (i%2==0){
                even+=i;
            }
            else{
                odd+=i;
            }
            i++;
        }while(i<=50);
        System.out.println(even);
        System.out.println(odd);

    }
}