public class EvenOdd {

    static int sumEvenDigits(int n) {
        int sum = 0;
        n = Math.abs(n);

        while (n > 0) {
            int digit = n % 10;
            if ((digit & 1) == 0) { // Even check
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    static int sumOddDigits(int n) {
        int sum = 0;
        n = Math.abs(n);

        while (n > 0) {
            int digit = n % 10;
            if ((digit & 1) == 1) { // Odd check
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 123456789;

        System.out.println("Even digit sum: " + sumEvenDigits(num));
        System.out.println("Odd digit sum: " + sumOddDigits(num));
    }
}