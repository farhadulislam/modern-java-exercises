package islam.farhad.exercises.javaFundamentals.dateTime;

import java.time.*;

public class Java8DateTimeExample1 {

    public static void main(String[] args) {

        System.out.println(getLocalDate() + "\t" + getLocalTime());
        System.out.println("LocalDateTime\t"+ getLocalDateTime());
        System.out.println("Get Today from LocalDateTime\t" + getTodayFromLocalDateTime());
        System.out.println("Time difference\t" +  getTimeDifference());
    }

    private static LocalDate getLocalDate(){
        return LocalDate.of(2022, Month.OCTOBER,18);
    }

    private static LocalTime getLocalTime(){
        return LocalTime.of(22, 18);
    }

    private static LocalDateTime getLocalDateTime(){
        return LocalDateTime.of(2022, Month.AUGUST,29,10,30);
    }

    private static LocalDateTime getDateTimeComponent(){
        return LocalDateTime.of(getLocalDate(), getLocalTime());
    }

    private static LocalDateTime getTodayFromLocalDateTime(){
        return LocalDateTime.now();
    }

    private static int getTimeDifference(){
        ZonedDateTime newcastle = ZonedDateTime.now(ZoneId.of("Europe/London "));
        ZonedDateTime dhaka = ZonedDateTime.now(ZoneId.of("Asia/Dhaka"));
        return newcastle.getHour() - dhaka.getHour();
    }


}
