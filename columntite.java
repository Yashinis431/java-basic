import java.util.*;
class coilumntite{
    public static int titleToNumber(String columnTitle) {
        int sum=0;
        int val=0;
        if(columnTitle.length()==0) return-1;
        for(int c:columnTitle.toCharArray()){
            sum*=26;
            System.out.println(sum);
            val=1+(c-'A');
            sum+=val;
            System.out.println(sum);
        }
        return sum;
        
    }
    public static void main(String[] args){
        String s="AAA";
        int n=titleToNumber(s);
        System.out.print(n);

    }
}

