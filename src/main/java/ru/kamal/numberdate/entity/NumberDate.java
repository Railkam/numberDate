package ru.kamal.numberdate.entity;

import java.time.LocalDate;
import java.util.Random;

import static java.lang.String.valueOf;

public class NumberDate {
    private LocalDate date;
    private static final int min = 10000, max = 99999;
    private Random rand;
    private String number;
    public NumberDate() {
        date = LocalDate.now();
        rand = new Random();
        int randomNum = rand.nextInt(max-min + 1) + min;
        number = valueOf(randomNum+valueOf(date.getYear())+valueOf(date.getMonthValue())+valueOf(date.getDayOfMonth()));
    }
    public String getNumber() {
        return this.number;
    }

}
