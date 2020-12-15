package by.bnty.fitr.poit.matsak.javalabs.lab5.controller;

import by.bnty.fitr.poit.matsak.javalabs.lab5.model.*;

import static by.bnty.fitr.poit.matsak.javalabs.lab4.view.Printer.println;
public class Lab5 {
    public static void main(String[] args) {
        println(Integer.toString(TaskA.calculateAmountOfNumbers(1224)));
        println(TaskB.isOddInNumber(2418));
        println(TaskC.reverse(1246436));
        println(TaskD.maxDig(463527625));
        println(TaskE.fibo(6)+"");
    }
}
