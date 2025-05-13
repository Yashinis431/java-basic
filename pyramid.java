import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Initialize variables for the series calculation
        int a = 0, b = 3;

        // Loop to generate the pyramid
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                // Calculate the term in the series
                a = a + 2;
                if (i == 1)
                    b = 3;
                else
                    b = b + 4;
                int term = a * b;

                // Print the term with leading zeroes to ensure 5-digit width
                System.out.printf("%05d ", term);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
/*Problem Statement:
Identify the logic behind the series
6 28 66 120 190 276….
The numbers in the series should be used to create a Pyramid. The base of the Pyramid will be the widest and start converging towards the top where there will only be one element.
Each successive layer will have one number less than that on the layer below it. The width of the Pyramid is specified by an input parameter N. In other words, N numbers will be on the bottom layer of the pyramid.
The Pyramid construction rules are as follows
The first number in the series should be at the top of the Pyramid
The last N number of the series should be on the bottom-most layer of the Pyramid, with the  Nth number being the right-most number of this layer.
Numbers less than 5 digits must be padded with zeroes to maintain the sanctity of a Pyramid when printed. Look at the examples below to get a pictorial understanding of what this rule means.
Example
If the input is 2, the output will be
00006
00028 00066
If the input is 3, the output will be
00006
00028 00066
00120 00190 00276
Input format :
The input consists of an integer, representing the number N that corresponds to the width of the bottom-most layer of the Pyramid.
Output format :
The output prints the Pyramid constructed out of numbers in the series as per stated construction rules.
Refer to the sample output for formatting specifications.
Code constraints :
0 < N ≤ 10
Sample test cases :
Input 1 :
2
Output 1 :
00006 
00028 00066 
Input 2 :
3
Output 2 :
00006 
00028 00066 
00120 00190 00276  */
