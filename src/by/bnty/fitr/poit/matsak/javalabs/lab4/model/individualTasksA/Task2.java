package by.bnty.fitr.poit.matsak.javalabs.lab4.model.individualTasksA;

public class Task2 {
    static char[] vowels={'a','e','i','o','u','y'};
    public static boolean isVowel(char letter){
        for(char vowel: vowels){
            if(letter==vowel){
                return true;
            }
        }
        return false;
    }
}
