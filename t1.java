import java.io.*;
import java.util.*;
class CaptionContest {
	public static void main(String [] args) {
		int i,min=0,max=0;
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		str1 = sc.next();
		str2 = sc.next();
	    for(i=0;i<str1.length();i++)
	    {
	        if(str1.charAt(i)!=str2.charAt(i)) {
	            if((str1.charAt(i)!=63)&&(str2.charAt(i)!=63)) {
	            	min++;
	            	max++;
	            	}
	            else {
	            	max++;
	            	}
	        }
	        else if((str1.charAt(i)==str2.charAt(i))&&(str1.charAt(i)==63)) {
	        	max++;
            }
	    }
	    System.out.print(min+" "+max);
	}
}
/*Problem Statement



Caption Contest



Exeter Caption Contest is a competition open to all writers worldwide. The entrants will have one day to compose and submit a caption that will be based on the theme posted on the competition page.



Robin, a creative writer had penned two captions for the contest but he unknowingly misplaced them. After searching long, he managed to locate his captions, but some letters in them have become unreadable. The captions were on two very old sheets of paper, each of which originally contained a string of lowercase English letters. The strings on both sheets have equal lengths.



Robin would like to estimate the difference between these strings. Let's assume that the first string is named S1, and the second S2. The unreadable symbols are specified with the question mark symbol '?'. The difference between the strings equals the number of positions i, such that S1i is not equal to S2i, where S1i and S2i denote the symbol at the i th position in S1 and S2, respectively.

Robin would like to know the minimal and the maximal difference between the two strings if he changes all unreadable symbols to lowercase English letters. Robin is not an expert in programming and so he needs your help solving this problem!

Input format :
The first line of the input contains a string S1.

The second line of the input contains a string S2.

Both strings consist of lowercase English letters and question marks in places where the symbols are unreadable.

Output format :
Output the minimal and maximal difference between two given strings separated by a single space.



Refer to sample input and output for formatting specifications.

Sample test cases :
Input 1 :
a?c
??b
Output 1 :
1 3
Input 2 :
???a
???a
Output 2 :
0 3 */