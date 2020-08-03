package Replits;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Time {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            timeConversion(scan.nextLine());
        }

        public static void timeConversion(String s) {
            s=s.toLowerCase();
            int hour = Integer.parseInt(s.substring(0, s.indexOf(":"))); //05:25:55
            int minute = Integer.parseInt(s.substring(s.indexOf(":")+1,s.lastIndexOf(":")));
            int second = Integer.parseInt(s.substring(s.lastIndexOf(":")+1, s.lastIndexOf(":")+3));

            if(s.contains("pm")){
                hour +=12;
            }
            DateTimeFormatter militaryTime = DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.println(LocalTime.of(hour,minute,second).format(militaryTime));

        }
    }

