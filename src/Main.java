//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.OffsetDateTime;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //Grabbing infos of time
        OffsetDateTime now = OffsetDateTime.now();
        //formatting time on a medium size
        String dateString = now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        //formating text on short visual effect
        String dateString2 = now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        // creatin an object zonedatetime so i can add info about GEO location.....
        ZonedDateTime now2 = OffsetDateTime.parse("2025-02-05T10:03:33.647342+01:00").toZonedDateTime();
        // ...so i will be able to print a long visualization
        String dateString3 = now2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        //printing my results
        System.out.println(now);
        System.out.println(dateString);
        System.out.println(dateString2);
        System.out.println(dateString3);
    }
}