package by.bnty.fitr.poit.matsak.javalabs.lab5.model;

public class TaskB {
    public static String isOddInNumber(int number){
        int oddCounter=0;
        int evenCounter=0;
        String[] num=String.valueOf(number).split("");
        for (String i: num) {
            if(Integer.parseInt(i)%2==0){
                evenCounter++;
            }else {
                oddCounter++;
            }
        }
        return "There is "+oddCounter+" odds and "+evenCounter+" evens";
    }
}
