import java.util.*;

public class Task_7_Hashtag_Frequency_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> freq = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String tag = sc.next();
            freq.put(tag, freq.getOrDefault(tag, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : freq.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        sc.close();
    }
}
