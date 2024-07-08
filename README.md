# Nouveauté Java

## LocalDateTime et Duration

Java 8 a introduit lune nouvelle API de date et d'heure, qui a été conçue pour remplacer al'ancienne API héritée.
LocalDateTime est une class immuable qui représente une date et une heure sans informations de fuseau horaire. Voici un exemple d'utilisation de LocalDateTime :

```java
LocalDateTime now = LocalDateTime.now();
System.out.println("Date et heure actuelle : " + now);

LocalDateTime tomorrow = now.plusDays(1);
System.out.println("Demain il sera : " + tomorrow);
```

Duration est une classe qui représente une durée entre 2 instants temporels. Voici un exemple d'utilisation de Duration :

```java
LocalDateTime now = LocalDateTime.now();
LocalDateTime inOneHour = now.plusHours(1);

Duration duration = Duration.between(now, inOneHour);
System.out.println("Il y a " + duration.getSeconds() + " second entre maintenant et dans une heure");
```

## Text Blocks

Java 15 a introduit les text blocks, qui permettent de créer des chaînes de caractères sur plusieurs lignes sans avoir à utiliser des séquences d'échappement. Les text blocks sont délimités par 3 guillemets double (""") et peuvent contenir n'importe quel caractère, y compris des guillemets doubles et des retours à la ligne. Voici un exemple d'utilisation de text blocks pour une requête SQL :

```java
String auery = """
    SELECT * FROM users
    WHERE age > 18
    AND country = 'France'
    ORDER BY name DESC
    """;
```

## Class Records

Java 14 a introduit les class records, qui sont des classes immuables qui encapsulent un ensemble de valeurs. Les class records sont utiles pour représenter des données qui n'ont pas besoin d'être modifiées après leur création. Voici un exemple d'utilisation de class records :

```java
record User(String name, int age) {}

var john = new User("John Doe", 35);
System.out.println("Utilisateur : " + john);
```

## Pattern Matching

Java 14 a également introduit le pattern matching pour l'instruction switch, qui permet de comparer une valeur avec plusieurs motifs et d'exécuter du code en fonction du motif correspendant. Java 16 a étendu le pattern matching aux expressions instanceof. Voici un exemple d'utilisation du pattern matchingf avec instanceof :

```java
Object obj = "Hello World !";
if (obj instanceof String str) {
    System.out.println("La chaîne de caractères est : " + str);
} else if (obj instanceof Number num) {
    System.out.println("Le nombre est : " + num);
} else {
    System.out.println("C'est une autre chose");
}
```

## Class Sealed

Java 15 a introduit les class sealed, qui sont des classes qui ne peuvent être étendues que par des classes spécifiques. Les class sealed sont utiles pour créer des hiérarchies de classes fermées, où toutes les classes dérivées sont connues à l'avance. Voici un exemple d'utilisation de class sealed :

```java
public sealed interface Shape permits Circle, Rectangle {
    double area();
}

public final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public final class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
```

Dans cet exemple, l'interface Shape est déclarée comme sealed et ne peut être étendue que par les classes Circle et Rectangle."# Nouveaut-_JAVA" 
