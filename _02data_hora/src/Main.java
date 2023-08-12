import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2021-08-19");
        LocalDateTime d05 = LocalDateTime.parse("2021-08-19T18:00");
        Instant d06 = Instant.parse("2021-08-19T18:00:00Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = "+ d04.format(fmt1));
        System.out.println("d04 = "+ fmt1.format(d04));
        System.out.println("d04 = "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = "+ d05.format(fmt1));
        System.out.println("d05 = "+ d05.format(fmt2));
        System.out.println("d05 = "+ d05.format(fmt4));

        System.out.println("d06 = "+ fmt3.format(d06));
        System.out.println("d06 = "+ fmt5.format(d06));

    }
}