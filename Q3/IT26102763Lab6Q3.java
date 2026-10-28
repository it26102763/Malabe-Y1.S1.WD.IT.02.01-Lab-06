import java.util.Scanner;

public class IT26102763Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int sumOfSquare = 0;
        int count = 0;
        double meanOfSquare, rms = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != -99) {
            if (number > 0) {
                sumOfSquare = sumOfSquare + (number * number);
                count++;
            } else {
            }
            System.out.print("Enter a number: ");
            number = input.nextInt();
        }
        if (count > 0) {
            meanOfSquare = (double) sumOfSquare / count;
            rms = Math.sqrt(meanOfSquare);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("Valid numbers mokuth enter kare na.");
        }
    }
}
