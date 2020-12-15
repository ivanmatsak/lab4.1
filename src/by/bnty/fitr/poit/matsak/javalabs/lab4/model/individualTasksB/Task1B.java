package by.bnty.fitr.poit.matsak.javalabs.lab4.model.individualTasksB;

public class Task1B {
    public static String dayOfTheWeek(int num){
        switch (num){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid input";
        }
    }
}
