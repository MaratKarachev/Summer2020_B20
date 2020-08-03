package day33_LocalDateTime;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {

    /*
    year: yy, yyyy
    month: MM(number), MMM(three letter), MMMM (fullname)
    days: dd
    days name: E (three letter), EEEE (full name)
     */

    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(" MMMM/dd/yyyy, EEEE");

        LocalDate ld = LocalDate.of(2020, 7, 26);

        System.out.println(ld);
        System.out.println(ld.format(dateFormat));

    /*
    hours: hh
    minutes: mm
    seconds: ss
    am/pm: a
     */
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));



        //May/20/2019 DayName, 4:30PM

        DateTimeFormatter timeFormat1 = DateTimeFormatter.ofPattern(" MMMM/dd/yyyy, EEEE hh:mm a");

        LocalDateTime time1 = LocalDateTime.of(2019,5,20, 16,30 );
        System.out.println(time1.format(timeFormat1));

        System.out.println(LocalDateTime.now().format(timeFormat1));

        // Saturday 4:34:45 PM
        LocalDateTime rNow = LocalDateTime.now();

        DateTimeFormatter Now1 = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");

        System.out.println(LocalDateTime.now().format(Now1));

    }
}
