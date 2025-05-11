import java.util.*;
class bank{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int option = sc.nextInt();
        int Balance = 2000;
        switch(option){
            case 1:
                int amount = sc.nextInt();
                Balance +=amount;
                System.out.print(Balance);
            break;
            case 2:
                int at = sc.nextInt();
                if (Balance>=at){
                    Balance -= at;
                    System.out.print(Balance);
                }
            break;
            case 3:
                System.out.print(Balance);
            break;

        }



    }
}