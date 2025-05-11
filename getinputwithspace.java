import java.util.*;
public class getinputwithspace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input:");
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        //for(String input1:inputs){
          //  System.out.println(input);
           // break;
        //}
        //System.out.print(Arrays.toString(inputs));  o/p [1,2,5,4,6]
        sc.close();

    }
    
}
