package by.bnty.fitr.poit.matsak.javalabs.lab5.model;

public class TaskC {
    public static String reverse(int num){
        if(num<0){
            String str=String.valueOf(num).substring(1);
            StringBuilder strB=new StringBuilder(str);
            return "-"+strB.reverse();
        }
        return new StringBuilder(String.valueOf(num)).reverse()+"";
    }
}
