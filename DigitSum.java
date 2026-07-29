import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter option (even/odd): ");
        String option = sc.next();

        int sum = 0;
        n = Math.abs(n);

        while (n > 0) {
            int digit = n % 10;

            if (option.equalsIgnoreCase("even") && digit % 2 == 0)
                sum += digit;
            else if (option.equalsIgnoreCase("odd") && digit % 2 != 0)
                sum += digit;

            n = n / 10;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}