package by.bnty.fitr.poit.matsak.javalabs.lab4.model.extraTask;

import java.time.*;

public class GregorianCalendar {
    public static String calculate(int year, int month, int day){
        LocalDate specificDate = LocalDate.of(year,month, day);
        return specificDate.plusDays(1).toString();
    }
}
