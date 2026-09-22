import java.util.*;

public class Task_1_Salary_Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> salaries = new ArrayList<>();
        for (int i = 0; i < n; i++) salaries.add(sc.nextInt());

        salaries.stream()
                .map(s -> (int)(s * 1.10))
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        sc.close();
    }
}

