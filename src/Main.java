import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number greater than 1: ");
        int n = input.nextInt();
        int count = 1;
        int sum = 0;

        while (count <= n) {
            if (n % count == 0) {
                sum += count;

            }
            count++;


        }
        System.out.println("The sum of all factors is " + sum);
    }
}