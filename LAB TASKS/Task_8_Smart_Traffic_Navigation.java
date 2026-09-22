import java.util.*;

public class Task_8_Smart_Traffic_Navigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int source = sc.nextInt(), destination = sc.nextInt();
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int u = q.poll();
            if (u == destination) break;
            for (int v : graph.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }

        System.out.println(visited[destination] ? "YES" : "NO");
        sc.close();
    }
}
