import java.util.Scanner;

public class IT26102763Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;
        int sum = 0;

        System.out.println("Please enter 10 numbers:");
        
        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = scanner.nextInt();
            sum += numbers[count];
            count++;
        }

        System.out.println("The numbers you entered are:");
        count = 0;
        while (count < 10) {
            System.out.print(numbers[count] + " ");
            count++;
        }
        System.out.println();

        double average = (double) sum / numbers.length;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}