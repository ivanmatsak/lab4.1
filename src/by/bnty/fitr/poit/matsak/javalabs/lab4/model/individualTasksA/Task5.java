package by.bnty.fitr.poit.matsak.javalabs.lab4.model.individualTasksA;

public class Task5 {
    public static String surprisePies(){
        int num=(int)((Math.random()*5));
        switch (num){
            case 0:
                return "Дьявол скрытен";
            case 1:
                return "Следуй за собакой";
            case 2:
                return "Ты никогда не будешь прощён";
            case 3:
                return "Ты был неправильно рождён";
            case 4:
                return "Проснись";

        }
        return "";
    }
}
