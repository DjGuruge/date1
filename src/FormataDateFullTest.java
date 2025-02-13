import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class FormataDateFullTest {

    @Test
    void creaDateInFull() {
        String res = FormataDateFull.creaDateInFull("2002-03-01T13:00:00Z");
        assertEquals("venerdì 1 marzo 2002 13:00:00 Z",res);
    }
    @Test
    void creaDateInFullCambioAnno() {
        String res = FormataDateFull.creaDateInFull("2050-03-01T13:00:00Z");
        assertEquals("martedì 1 marzo 2050 13:00:00 Z",res);
    }
    @Test
    void creaDateInFullGiornoDopo() {
        String res = FormataDateFull.creaDateInFull("2002-03-02T13:00:00Z");
        assertEquals("sabato 2 marzo 2002 13:00:00 Z",res);
    }
}