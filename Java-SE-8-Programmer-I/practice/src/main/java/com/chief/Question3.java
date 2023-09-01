package com.chief;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question3 {
    public static void main(String[] args) {
       //!The following formatter expects a time component hence the code fails
        // String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);

        //?This works because only date is supplied
        String date =LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}
