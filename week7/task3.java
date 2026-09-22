
import java.util.*;

public class Main {

    static class CheckInData {
        String station;
        int time;

        CheckInData(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    static class UndergroundSystem {

        Map<Integer, CheckInData> checkInMap = new HashMap<>();
        Map<String, double[]> travelMap = new HashMap<>();

        public void checkIn(int id, String stationName, int t) {
            checkInMap.put(id, new CheckInData(stationName, t));
        }

        public void checkOut(int id, String stationName, int t) {
            CheckInData data = checkInMap.get(id);

            int travelTime = t - data.time;

            String key = data.station + "," + stationName;

            if (!travelMap.containsKey(key)) {
                travelMap.put(key, new double[]{0, 0});
            }

            double[] trip = travelMap.get(key);

            trip[0] += travelTime;
            trip[1]++;

            checkInMap.remove(id);
        }

        public double getAverageTime(String startStation, String endStation) {
            String key = startStation + "," + endStation;

            double[] trip = travelMap.get(key);

            return trip[0] / trip[1];
        }
    }

    public static void main(String[] args) {

        UndergroundSystem system = new UndergroundSystem();

        system.checkIn(45, "Leyton", 3);
        system.checkIn(32, "Paradise", 8);
        system.checkIn(27, "Leyton", 10);

        system.checkOut(45, "Waterloo", 15);
        system.checkOut(27, "Waterloo", 20);
        system.checkOut(32, "Cambridge", 22);

        System.out.println(
            system.getAverageTime("Paradise", "Cambridge")
        );

        System.out.println(
            system.getAverageTime("Leyton", "Waterloo")
        );

        system.checkIn(10, "Leyton", 24);

        System.out.println(
            system.getAverageTime("Leyton", "Waterloo")
        );

        system.checkOut(10, "Waterloo", 38);

        System.out.println(
            system.getAverageTime("Leyton", "Waterloo")
        );
    }
}

