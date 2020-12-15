package by.bnty.fitr.poit.matsak.javalabs.lab5.model;

public class TaskA {
    public static int calculateAmountOfNumbers(int number){
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
