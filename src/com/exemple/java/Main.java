package com.exemple.java;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        /*double number = 1_542.12;

        NumberFormat numFormatter = NumberFormat.getNumberInstance();
        System.out.println("number is " + numFormatter.format(number));

        Locale locale = new Locale("en", "US");
        NumberFormat currFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println("currency: " + currFormatter.format(number));*/
        /*Date date = new Date();
        System.out.println(date);

        GregorianCalendar gc = new GregorianCalendar(2015, Calendar.NOVEMBER, 30);
        System.out.println(gc.getTime());

        gc.add(GregorianCalendar.DATE, 1);
        System.out.println(gc.getTime());
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df.format(gc.getTime()));*/

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        System.out.println(dtf.format(ldt));

        FormatStyle fs = FormatStyle.FULL;
        DateTimeFormatter dfs = DateTimeFormatter.ofLocalizedDate(fs);
        System.out.println(dfs.format(ldt));

        DateTimeFormatter dtfP = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(dtfP.format(ldt));


    }
}