import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("How many numbers will you enter? ");
        int count = scanner.nextInt();

     
        if (count < 1) {
            System.out.println("You must enter at least one number.");
            return;
        }

      
        System.out.print("Enter number 1: ");
        int num = scanner.nextInt();
        int min = num;
        int max = num;

       
        for (int i = 2; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            num = scanner.nextInt();

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        int sum = min + max;

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Sum of min and max: " + sum);

        scanner.close();
    }
}
