import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2021-08-19");
        LocalDateTime d05 = LocalDateTime.parse("2021-08-19T18:00");
        Instant d06 = Instant.parse("2021-08-19T18:00:00Z");

        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        LocalDate nextWeekLocalDate = d04.plusWeeks(1);

        System.out.println("localDate = "+ d04);
        System.out.println("pastWeekLocalDate = "+ pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = "+ nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);

        System.out.println("localDateTime = "+ d05);
        System.out.println("pastWeekLocalDateTime = "+ pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = "+ nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("instant = "+ d06);
        System.out.println("pastWeekInstant = "+ pastWeekInstant);
        System.out.println("nextWeekInstant = "+ nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = "+ t1.toDays());
        System.out.println("t2 dias = "+ t2.toDays());
        System.out.println("t3 dias = "+ t3.toDays());
        System.out.println("t4 dias = "+ t4.toDays());
    }
}