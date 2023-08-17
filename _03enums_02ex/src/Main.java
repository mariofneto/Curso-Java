import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //"21/06/2018 13:05:44";

        Comment cm1 = new Comment("Have a nice trip");
        Comment cm2 = new Comment("Wow that's awesome!");

        Post post1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "im going to visit this wonderful country!",
                12
        );

        post1.addComment(cm1);
        post1.addComment(cm2);

        Comment cm3 = new Comment("Good night");
        Comment cm4 = new Comment("May the Force be with you");

        Post post2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5
        );

        post2.addComment(cm3);
        post2.addComment(cm4);

        System.out.println(post1);
        System.out.println(post2);

    }
}