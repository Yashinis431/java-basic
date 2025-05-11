import java.util.*;
public class moveallzerotoend {
    public static void main(String[] args){
        int[] arr={9,0,2,0,1,4,0,3,0};
        int z=0;
        int nz=0;
        while(nz<arr.length){
            if(arr[nz]!=0){
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
        System.out.print(Arrays.toString(arr));
        
    }
        
}

    

