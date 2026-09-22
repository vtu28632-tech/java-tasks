import java.util.*;

public class Task_10_Secure_Authentication_Stress_Testing {
    static boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int passed = 0;

        for (int i = 0; i < n; i++) {
            String username = sc.next();
            String password = sc.next();


            if (username == null || password == null ||
                username.length() > 100 || password.length() > 100) {
                continue;
            }

            try {
                if (authenticate(username, password)) passed++;
            } catch (Exception ignored) {
                
            }
        }

        System.out.println("Valid logins: " + passed);
        sc.close();
    }
}

