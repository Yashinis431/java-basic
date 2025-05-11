import java.util.*;
class magic{
    public static void main (String[] args){
        System.out.print("Enter guess:");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        int magno=50;
        while(guess != magno){
            if (guess<magno){
            System.out.println("low");
            }

            else if(guess>magno){
            System.out.println("high");
            }
            else
            System.out.println("congrats");
            break;
            


        }
        


    }
}