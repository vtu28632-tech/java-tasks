import java.util.Scanner;

@FunctionalInterface
interface DigitSum {
    int calculate(int num, boolean even);
}

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter 1 for Even Digit Sum or 2 for Odd Digit Sum: ");
        int choice = sc.nextInt();

        DigitSum ds = (n, even) -> {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                if (even) {
                    if (digit % 2 == 0)
                        sum += digit;
                } else {
                    if (digit % 2 != 0)
                        sum += digit;
                }
                n /= 10;
            }
            return sum;
        };

        if (choice == 1)
            System.out.println("Sum of Even Digits = " + ds.calculate(num, true));
        else
            System.out.println("Sum of Odd Digits = " + ds.calculate(num, false));

        sc.close();
    }
}
