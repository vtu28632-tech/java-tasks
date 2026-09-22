import java.util.*;

public class Task_9_Calculator_Unit_Testing {
    static int add(int a, int b) { return a + b; }
    static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    static void assertEquals(int expected, int actual) {
        if (expected != actual)
            throw new AssertionError("Expected " + expected + " but got " + actual);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        try {
            int result = op.equals("+") ? add(a, b) : divide(a, b);
            int expected = op.equals("+") ? a + b : a / b;
            assertEquals(expected, result);
            System.out.println("Test Passed");
        } catch (Exception | AssertionError e) {
            System.out.println("Test Failed");
        }
        sc.close();
    }
}

