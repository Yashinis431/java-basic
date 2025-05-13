import java.util.*;
class str{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name");
        String s=sc.nextLine();
        System.out.println("dept");
        String dept=sc.nextLine();
        System.out.println("register no");
        Long Reg=sc.nextLong();
        System.out.println("year");
        int year=sc.nextInt();
        System.out.print(s+" "+Reg+" "+year+" "+dept);


    }
}
