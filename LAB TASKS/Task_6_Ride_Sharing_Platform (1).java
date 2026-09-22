import java.util.*;

public class Task_6_Ride_Sharing_Platform {
    interface Vehicle {
        int fare(int distance);
    }

    static class Bike implements Vehicle {
        public int fare(int distance) { return distance * 5; }
    }

    static class Auto implements Vehicle {
        public int fare(int distance) { return distance * 12; }
    }

    static class Cab implements Vehicle {
        public int fare(int distance) { return distance * 12; }
    }

    static Vehicle create(String type) {
        return switch (type.toLowerCase()) {
            case "bike" -> new Bike();
            case "auto" -> new Auto();
            case "cab" -> new Cab();
            default -> throw new IllegalArgumentException("Invalid ride type");
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int distance = sc.nextInt();
            try {
                System.out.println(create(type).fare(distance));
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid booking");
            }
        }
        sc.close();
    }
}

