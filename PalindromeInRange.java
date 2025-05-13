import java.util.Scanner;

public class PalindromeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading inputs
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        // Loop from lower + 1 to upper - 1
        for (int i = lower + 1; i < upper; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Helper method to check palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return original == reversed;
    }
}

