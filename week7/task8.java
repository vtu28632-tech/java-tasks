class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: Arithmetic");
        System.out.println(adder.add(42, 13));
        System.out.println(adder.add(20, 0));
    }
}