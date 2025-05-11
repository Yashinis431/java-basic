import java.util.*;

public class bobandnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read entire line and split numbers
        String line = sc.nextLine();
        String[] parts = line.trim().split("\\s+");

        int oddCount = 0;
        for (String s : parts) {
            int num = Integer.parseInt(s);
            if (num % 2 != 0) {
                oddCount++;
            }
        }

        // If odd count is odd => can't pair all odds
        if (oddCount % 2 != 0) {
            System.out.println(-1);
        } else {
            System.out.println(oddCount / 2);
        }
    }
}
/* Suppose we have a friend named Bob, and he is playing a game with himself. He gives himself a list of numbers called nums. Now in each turn, Bob selects two elements of the list and replaces them with one positive integer with the same sum as the numbers he selected. Bob declares the victory when all of the number in the array are even. We have to find the minimum number of turns are required to make by Bob, so he can declare victory, if there is no such solution, then return -1.

 

 

Input format :
2 3 4 9 7 13





Output format :
2

Sample test cases :
Input 1 :
2 3 4 9 7 13
Output 1 :
2 */