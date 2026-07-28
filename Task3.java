import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50};
        int key = sc.nextInt();

        int l = 0, h = a.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] == key) {
                System.out.println("Found");
                return;
            }
            if (a[m] < key) l = m + 1;
            else h = m - 1;
        }
        System.out.println("Not Found");
    }
}
