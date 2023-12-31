import java.time.OffsetDateTime;
import java.time.format.FormatStyle;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
    System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
    }
}