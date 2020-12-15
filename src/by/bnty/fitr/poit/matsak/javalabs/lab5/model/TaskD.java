package by.bnty.fitr.poit.matsak.javalabs.lab5.model;

public class TaskD {
    public static String maxDig(int num) {
        int a, m = 0;
        while (num > 0) {
            a = (int) num % 10;
            if (a > m) m = a;
            num /= 10;
        }
        return ""+m;
    }
}
