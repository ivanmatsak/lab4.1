package by.bnty.fitr.poit.matsak.javalabs.lab6.controller;

import by.bnty.fitr.poit.matsak.javalabs.lab6.model.IndividualTask;

import static by.bnty.fitr.poit.matsak.javalabs.lab4.view.Printer.println;

public class Lab6 {
    public static void main(String[] args) {

        println("Multiplication of evens= "+IndividualTask.findMultOfEvens(new int[]{1,-3,775,24,-345,1,2,-3,31,135,31})+"");
        int[] array=new int[]{1,0,-3,775,24,-346,1,24,-4,32,0,134,32};
        println("Sum between first and last null= "+IndividualTask.findSumBetweenNulls(array,IndividualTask.findFirstNull(array),
                IndividualTask.findLastNull(array))+"");
    }
}
