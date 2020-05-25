package com.mannou.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTimeApi {
    public static void main(String[] args) {
        Date birthDate = new Date(999999999999l);
        System.out.println(birthDate);

        LocalDate birthDay = LocalDate.of(2007, 9, 27);
        System.out.println(birthDay);
        LocalDateTime birthDayAtMidnight = LocalDateTime.of(2007, 9, 27, 0, 0, 0, 0);
        System.out.println(birthDayAtMidnight);
    }
}
