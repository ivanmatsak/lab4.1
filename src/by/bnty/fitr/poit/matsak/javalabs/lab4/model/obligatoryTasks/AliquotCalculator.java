package by.bnty.fitr.poit.matsak.javalabs.lab4.model.obligatoryTasks;

public class AliquotCalculator {
    static int[] powers={2, 3, 5, 7, 11, 13, 17 ,19};
    public static String calculate(int num){
        String answer="Num: "+num+" is a multiple of ";
        int len=answer.length();
        for(int power : powers){
            if(num%power==0){
                answer+=power+" ";
            }
        }
        return answer.length()==len ? answer+"none": answer;
    }
}
