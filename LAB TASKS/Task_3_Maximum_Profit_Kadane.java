import java.util.*;

public class Task_3_Maximum_Profit_Kadane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int current = nums[0], best = nums[0];
        for (int i = 1; i < n; i++) {
            current = Math.max(nums[i], current + nums[i]);
            best = Math.max(best, current);
        }

        System.out.println(best);
        sc.close();
    }
}
