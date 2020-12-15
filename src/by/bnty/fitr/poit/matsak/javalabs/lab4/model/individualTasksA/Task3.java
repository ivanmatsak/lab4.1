package by.bnty.fitr.poit.matsak.javalabs.lab4.model.individualTasksA;


public class Task3 {
    public static String moodSensor(){
        int num= (int)(Math.random()*3);
        switch (num){
            case 0:
                return  "          "+"\n"+
                        "  0    0  "+"\n"+
                        "          "+"\n"+
                        " 00000000 "+"\n"+
                        "0        0";
            case 1:
                return  "          "+"\n"+
                        "  0    0  "+"\n"+
                        "          "+"\n"+
                        "0        0"+"\n"+
                        " 00000000 ";
            case 2:
                return  "          "+"\n"+
                        "  0    0  "+"\n"+
                        "          "+"\n"+
                        " 00000000 "+"\n"+
                        "          ";
        }
        return "";
    }
}
