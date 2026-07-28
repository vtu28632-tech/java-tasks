import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {40, 10, 30, 20, 50};
        int k = sc.nextInt();

        Arrays.sort(a);
        System.out.println(a[k - 1]);
    }
}
