package learn;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App 
{
    public static void main( String[] args )
    {
        // LocalDate now = LocalDate.now(); // LocalDate.now(): Renvoie la date actuelle
        // System.out.println(now);
        // System.out.println(LocalTime.now()); // LocalTime.now(): Renvoie l'heure actuelle


        LocalDateTime now = LocalDateTime.now();
        LocalDateTime inOneHour = now.plusHours(1); // plusHours(): méthode de localDateTime/Temporal qui rajoute des heures

        Duration duration = Duration.between(now, inOneHour); // between(): méthode de Duration qui compare 2 heures donnés
        System.out.println(duration.getSeconds()); // getSeconds(): méthode de LocalDateTime qui renvoie les secondes

        // Text Blocks
        String query;
        query = """
                SELECT * FROM users
                WHERE id = ?
                """;

        // Records
        var john = new Personne("JonhDoe", 35);
        System.out.println(john);

        // Pattern matching
        // Object obj  = "Hello Wolrd !";
        var obj = "Hello World !"; // Var est une déclaration de variable général
        if (obj instanceof String str) {
            System.out.println(str);
        }

        sealed class Shape permits Circle, Rectangle {
            final class Circle extends Shape {}
            final class Rectangle extends Shape {}
            non-sealed class Triangle extends Shape {}
            class EquilateralTriangle extends Triangle {}
        }
    }
}
