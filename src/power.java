import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 20: ");
        int n = input.nextInt();

        int[] power = new int[n];

        if (n < 1 || n > 20) {
            System.out.println("Number not between 1 & 20! Please try again!");
        } else {

            for (int i = 0; i < power.length; i++) {
                power[i] = (int) Math.pow(2, i);
            }
            for (int i = 0; i < power.length; i++) {
                System.out.println(power[i]);
            }


        }
    }
}

