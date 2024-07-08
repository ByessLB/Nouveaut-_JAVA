package learn;

public record Personne(String name, int age) {}
/**
 * Déclaré en records : permet de rendre les éléments
 * signifié qui n'ont pas besoin d'être modifiés. Il 
 * reproduit le constructor, les getters et les méthodes
 * pouvont jouir des éléments (méthodes toStrong, etc...)
 */