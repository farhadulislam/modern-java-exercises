package islam.farhad.TimeDate;

import java.time.*;

public class LocalDateTimeDemo1 {
    public static void main(String[] args) {
         // LocalDate
        LocalDate localDate1 = LocalDate.of(2025, 8, 25);
        int year = localDate1.getYear();
        Month month = localDate1.getMonth();
        int day = localDate1.getDayOfMonth();
        DayOfWeek dow = localDate1.getDayOfWeek();

        int len = localDate1.lengthOfMonth();

        boolean leapYear  = LocalDate.now().isLeapYear();

        LocalDate today = LocalDate.now();

        System.out.println(today);

         // LocalTime

        LocalTime localTime1 = LocalTime.of(10, 34, 10);

        int hour = localTime1.getHour();
        int min = localTime1.getMinute();
        int second = localTime1.getSecond();

        System.out.println("Hour:" + hour + " Min:"+ min + " Second:"+ second);

        //Parse localDate and localTime from  String

        LocalDate localDateParsed = LocalDate.parse("2025-08-25");
        LocalTime localTimeParsed = LocalTime.parse("10:38:50");

        System.out.println("Parsed");
        System.out.println("localDateParsed "+ localDateParsed);
        System.out.println("localTimeParsed "+ localTimeParsed);

        //LocalDateTime

        LocalDateTime localDateTime1 = LocalDateTime.of(2007, Month.OCTOBER, 11, 17, 33, 30);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate1, localTime1);

        System.out.println("localDateTime1 "+ localDateTime1);
        System.out.println("localDateTime2 "+ localDateTime2);

        // LocalDate from LocalDateTime
        LocalDate localDateFromLocalDateTime1 = localDateTime1.toLocalDate();
        LocalTime localTimeFromLocalDateTime1 = localDateTime1.toLocalTime();

        System.out.println("localDateFromLocalDateTime1 "+ localDateFromLocalDateTime1);
        System.out.println("localTimeFromLocalDateTime1 "+ localTimeFromLocalDateTime1);

        //LocalDateTime from LocalDate and LocalTime
        //LocalDate and LocalTime lack date and time, so while creating LocalDateTime, will supply the missing one

        LocalDateTime localDateTimeFromLocalDate = localDate1.atTime(localTime1);
        LocalDateTime localDateTimeFromLocaTime = localTime1.atDate(localDate1);

        System.out.println("localDateTimeFromLocalDate "+ localDateTimeFromLocalDate);
        System.out.println("localDateTimeFromLocaTime "+ localDateTimeFromLocaTime);





    }
}
