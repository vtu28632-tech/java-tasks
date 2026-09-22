import java.util.*;
import java.util.stream.*;

public class Task_2_Real_Time_Stream_Analytics {
    static class Reading {
        String id; int temperature;
        Reading(String id, int temperature) { this.id = id; this.temperature = temperature; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Reading> readings = new ArrayList<>();
        for (int i = 0; i < n; i++)
            readings.add(new Reading(sc.next(), sc.nextInt()));

        Map<String, Double> avg = readings.stream()
                .filter(r -> r.temperature > 50)
                .collect(Collectors.groupingBy(r -> r.id,
                        Collectors.averagingInt(r -> r.temperature)));

        avg.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        sc.close();
    }
}

