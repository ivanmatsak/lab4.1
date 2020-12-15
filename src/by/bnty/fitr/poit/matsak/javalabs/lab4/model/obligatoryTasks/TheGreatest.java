package by.bnty.fitr.poit.matsak.javalabs.lab4.model.obligatoryTasks;

import java.util.Arrays;

public class TheGreatest {
    public static String find(int... args){
        int max=args[0],min=args[0];
        for (int num: args) {
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        return max==min ? "Numbers are equal!!!" : "max: "+max+" ,min: "+min;
    }
}
