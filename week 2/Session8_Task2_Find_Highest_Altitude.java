class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0, highest = 0;
        for (int x : gain) {
            altitude += x;
            highest = Math.max(highest, altitude);
        }
        return highest;
    }
}
