package org.kay.learn.java8.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by kay on 24/12/16.
 */
public class DateMain {
    public static void main(String args[]) {
        String zone = "Asia/Kolkata";
        ZoneId istZoneID = ZoneId.of("Asia/Kolkata");

        Clock clock = Clock.system(ZoneId.of(zone)).withZone(istZoneID);
        System.out.println(clock.instant()); //No effect of time zone on clock
        //TODO what is the use of time zone in clock then?

        //LocalTime:
        ZoneId pdtZoneId = ZoneId.of("America/Los_Angeles");
        LocalTime localTime = LocalTime.now(pdtZoneId);
        LocalTime istLocalTime = LocalTime.now(istZoneID);
        //HH for 24 hours format
        //when using hh, AM/PM has to be there
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter timeFormater12h = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime parsedTime = LocalTime.parse("14:04:04",timeFormatter);
        LocalTime parsed12htime = LocalTime.parse("04:04:04 PM",timeFormater12h);
        //parsedTime = LocalTime.parse("23/12/2016 04:04:04",dateTimeFormatter);

        System.out.println("Local time in pdt:" + localTime);
        System.out.println("Local time in ist: " + istLocalTime);
        System.out.println(localTime.compareTo(istLocalTime));
        System.out.println("Parsed local time:" + parsedTime);
        System.out.println("Parsed Local time in 12 hour:" + parsed12htime);

        //LocalDateTime
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        LocalDateTime parsedDateTime = LocalDateTime.parse("23/12/2016 02:19:00 PM",dateTimeFormatter);
        System.out.println(parsedDateTime.format(dateTimeFormatter));

        //LocalDateTime to instant
        Instant dtToInstant = parsedDateTime.atZone(pdtZoneId).toInstant();
        System.out.println("Time in PDT:" + dtToInstant);

        //Parsing with time zone
        //for time zone name, like IST, PDT, use z

        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
        ZonedDateTime parsedDateTimeWithZone = ZonedDateTime.parse("23/12/2016 10:19:00 +0530",dateTimeFormatterWithZone);
        System.out.println(parsedDateTimeWithZone);

    }
}
