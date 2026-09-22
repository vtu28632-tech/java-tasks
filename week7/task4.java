import java.util.*;

class BrowserHistory {
    String[] history;
    int current;
    int end;

    public BrowserHistory(String homepage) {
        history = new String[5001];
        history[0] = homepage;
        current = 0;
        end = 0;
    }

    public void visit(String url) {
        current++;
        history[current] = url;
        end = current;
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history[current];
    }

    public String forward(int steps) {
        current = Math.min(end, current + steps);
        return history[current];
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");

        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");

        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.forward(1));

        browserHistory.visit("linkedin.com");

        System.out.println(browserHistory.forward(2));
        System.out.println(browserHistory.back(2));
        System.out.println(browserHistory.back(7));
    }
}