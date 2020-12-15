package by.bnty.fitr.poit.matsak.javalabs.lab4.model.obligatoryTasks;

public class DragonHeadsCounter {
    public static String count(int age){
        if(age<0){
            return "Invalid input!!!";
        }
        int heads=0,eyes=0;
        if(age>=300){
            heads+=age-300+800;
            return "heads: "+heads+" ,eyes: "+heads*2;
        }else if(age>=200){
            heads+=(age-200)*2+600;
            return "heads: "+heads+" ,eyes: "+heads*2;
        }
        return "heads: "+age*3+" ,eyes: "+age*6;
    }
}
