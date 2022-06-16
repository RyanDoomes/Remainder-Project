import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Please enter a number greater than 1: ");
            int n = input.nextInt();
            if (n<1){
                System.out.println("Number has to be greater than 1, Please enter new number: ");
            }
            else {
            int count = 1;
            int sum = 0;

            while (count <= n) {
                if (n % count == 0) {
                    sum += count;

                }
                count++;



        }
        System.out.println("The sum of all factors is " + sum);
            running=false;
            }
    }
    }
}