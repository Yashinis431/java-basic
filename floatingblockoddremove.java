import java.util.Scanner;
public class floatingblockoddremove {
    public static int lastFloatingBlock(int N) {
        // Find the largest power of 2 <= N
        int power = 1;
        while (power * 2 <= N) {
            power *= 2;
        }
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        System.out.println(lastFloatingBlock(N));
    }
}
















