class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();

        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            // Primary diagonal: top-left to bottom-right
            primary += arr.get(i).get(i);

            // Secondary diagonal: top-right to bottom-left
            secondary += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primary - secondary);
    }
}