import java.util.*;
class blood{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
         int age= sc.nextInt();
        int weight = sc.nextInt();
        String blood1 = sc.next();
        String blood2 = sc.next();
        if (age>=18&&weight>=45){
            if (blood1.equals(blood2))
            {
                System.out.print("blood can be donated");
            }
        }

    else
    System.out.print("cannot be donate");
        }



    }
