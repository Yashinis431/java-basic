import java.util.*;
class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int odd=0;
        int even=0;
        for (int i=1;i<=a;i++){
            int num=i;
            for(int j=1;j<=i;j++){
                if (j%2==0){
                    System.out.printf("%02d",even);
                    odd = even+(i-j)*2;
                }
                else{
                    System.out.print("%02d",odd);
                    even = odd+((n-(i-1))*2)-1;
                }
                

            }
            System.out.println();
        }
    }
}