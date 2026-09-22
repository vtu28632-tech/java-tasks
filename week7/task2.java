import java.util.*;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class Solution {

    static String count(ArrayList myList) {
        int a = 0, b = 0, c = 0;

        for (Object obj : myList) {
            if (obj instanceof Student)
                a++;
            if (obj instanceof Rockstar)
                b++;
            if (obj instanceof Hacker)
                c++;
        }

        return a + " " + b + " " + c;
    }

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equals("Student"))
                myList.add(new Student());

            if (type.equals("Rockstar"))
                myList.add(new Rockstar());

            if (type.equals("Hacker"))
                myList.add(new Hacker());
        }

        System.out.println(count(myList));
    }
}