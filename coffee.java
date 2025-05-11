import java.util.*;
public class coffee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        int tea=10;
        int coffee=15;
        int boost=15;
        int black =10;
        double totalbilling = 0.0;
        switch(option){
            case 1:
                int n=sc.nextInt();
                int amount=tea*n;
                System.out.println("tea:"+amount);
                totalbilling += amount ;
                System.out.print("total:"+ totalbilling);
                
            case 2:
                int x=sc.nextInt();
                int amount1=coffee*x;
                System.out.println("coffee:"+amount1);
                totalbilling += amount1 ;
                System.out.print("total:"+ totalbilling);
            case 3:
                int y=sc.nextInt();
                int amount2=boost*y;
                System.out.println("boost:"+amount2);
                totalbilling += amount2 ;
                System.out.print("total:"+ totalbilling);
            case 4:
                int z=sc.nextInt();
                int amount3=black*z;
                System.out.println("black:"+amount3);
                totalbilling += amount3 ;
                System.out.print("total:"+ totalbilling);
            case 5:
                System.out.println("exit");
                }
        }
        
}


