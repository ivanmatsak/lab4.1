package by.bnty.fitr.poit.matsak.javalabs.lab5.model;

public class TaskE {
    public static int fibo(int n)
    {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
