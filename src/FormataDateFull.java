import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormataDateFull {

    public static String creaDateInFull(String data) {
        ZonedDateTime nowZ = OffsetDateTime.parse(data).toZonedDateTime();
        return nowZ.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
    }
}
