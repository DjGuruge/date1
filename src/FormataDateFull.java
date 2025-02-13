import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormataDateFull {

    public static String creaDateInFull(OffsetDateTime data) {
        ZonedDateTime now = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        return now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
    }
}
