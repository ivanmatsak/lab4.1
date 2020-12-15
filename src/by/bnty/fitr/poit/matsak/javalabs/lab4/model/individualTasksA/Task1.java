package by.bnty.fitr.poit.matsak.javalabs.lab4.model.individualTasksA;

public class Task1 {
    public static boolean isSidesOfTriangle(int a, int b, int c){
        return a+b<=c || a+c<=b || c+b<=a ? false: true;
    }
}
