package islam.farhad.TimeDate;

import java.time.chrono.HijrahDate;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class IslamicCalendarDemo1 {
    public static void main(String[] args) {

        HijrahDate hijrahDate = HijrahDate.now();
        System.out.println(hijrahDate);

        HijrahDate ramadanDate = hijrahDate.with(ChronoField.DAY_OF_MONTH, 1)
                .with(ChronoField.MONTH_OF_YEAR, 9);
        System.out.println("Ramadan Starts on " + IsoChronology.INSTANCE.date(ramadanDate));
        System.out.println("Ramadan Ends on " + IsoChronology.INSTANCE.date(ramadanDate.with(TemporalAdjusters.lastDayOfMonth())));
    }
}
