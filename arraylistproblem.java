import java.util.*;
public class arraylistproblem {
    public static void main(String[] args){
        ArrayList <Integer> x= new ArrayList <>();
        x.add(1);
        x.add(3);
        x.add(2);
        x.add(5);
        x.add(4);
        int left=0;
        int right=x.size()-1;
        while(left<right){
            int temp=x.get(left);
            x.set(left,x.get(right));
            x.set(right,temp);
            left++;
            right--;
        }
        Collections.sort(x);
        Collections.sort(x,Collections.reverseOrder());
        System.out.print(x);
        Collections.rotate(x,-2);
        System.out.print(x);
    }
    
}
