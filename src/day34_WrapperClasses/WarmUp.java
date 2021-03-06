package day34_WrapperClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WarmUp {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime Today = LocalDateTime.now();

        System.out.println(Today.format(dtf));
    }
}
