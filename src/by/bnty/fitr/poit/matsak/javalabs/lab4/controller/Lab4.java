package by.bnty.fitr.poit.matsak.javalabs.lab4.controller;

import by.bnty.fitr.poit.matsak.javalabs.lab4.model.extraTask.GregorianCalendar;
import by.bnty.fitr.poit.matsak.javalabs.lab4.model.individualTasksA.*;
import by.bnty.fitr.poit.matsak.javalabs.lab4.model.individualTasksB.*;
import by.bnty.fitr.poit.matsak.javalabs.lab4.model.obligatoryTasks.*;

import static by.bnty.fitr.poit.matsak.javalabs.lab4.view.Printer.println;

public class Lab4 {
    public static void main(String[] args) {
        println(DragonHeadsCounter.count(372));
        println(TheGreatest.find(4,6,73,4,73,-23,3,0,2533,24));
        println(AliquotCalculator.calculate(732));
        println(Boolean.toString(Task1.isSidesOfTriangle(1,10,15)));
        println(Task1B.dayOfTheWeek(6));
        println(GregorianCalendar.calculate(1900,2,28));
    }
}
