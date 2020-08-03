package day33_LocalDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class TimeConversion {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            timeConversion(scan.nextLine());
        }

        public static void timeConversion(String s) {
            /*
             * Write your code here.
             */
            // Saturday 4:34:45 PM


            DateTimeFormatter New = DateTimeFormatter.ofPattern("hh:mm:ss ");

            System.out.println(LocalDateTime.now().format(New));


        }
    }

