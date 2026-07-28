public class Task4 {
    public static void main(String[] args) {
        int[] a = {10, 50, 20, 80, 40};
        int max = a[0];

        for (int i : a)
            if (i > max) max = i;

        System.out.println(max);
    }
}
