//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni


import java.time.format.DateTimeFormatter;
import java.time.OffsetDateTime;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //Grabbing infos of time
        OffsetDateTime now = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        //formatting time on a medium size
        String dateString = now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        //formating text on short visual effect
        String dateString2 = now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        FormataDateFull.creaDateInFull(now);
        System.out.println(now);
        System.out.println(dateString);
        System.out.println(dateString2);
        System.out.println(FormataDateFull.creaDateInFull(now));
    }
}