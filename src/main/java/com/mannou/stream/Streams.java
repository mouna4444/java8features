package com.mannou.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Programmation fonctionnelle.
 */
public class Streams {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("manNou");
        names.add("malEk");
        names.add("poUggY");

        for (int i = 0; i < names.size(); i++) {
            String nom = names.get(i);
            System.out.println("Bonjour " + nom.toUpperCase().charAt(0) + nom.substring(1, nom.length()).toLowerCase());
        }

        names.stream()
             .map(nameToLowerCase())
             .map(upperCaseFirstCHarOfTheName())
             .map(saluteThePerson())
             .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 3, 78, 89, 90);
        Predicate<Integer> numbersGreaterThan50Predicate = integer -> integer > 50;
        numbers.stream()
                .filter(numbersGreaterThan50Predicate)
                .map(number -> number - 50)
                .map(number -> number * number)
                .forEach(System.out::println);

    }

    private static Function<String, String> saluteThePerson() {
        return nom -> "Bonjour " + nom;
    }

    private static Function<String, String> upperCaseFirstCHarOfTheName() {
        return nom -> nom.substring(0, 1).toUpperCase() + nom.substring(1, nom.length());
    }

    private static Function<String, String> nameToLowerCase() {
        return String::toLowerCase;
    }
}

interface MalekInterface {
    void faireNImporteQuoi(String param);

    void raconterDeLaMerde();

    default void fairePipi() {
        System.out.println("Malek fait pipi");
    }

    default void faireKaka() {
        System.out.println("Malek fait kaka");
    }
}

abstract class MalekClass {
    private String attribut;

    abstract void faireNImporteQuoi(String param);

    abstract void raconterDeLaMerde();

    void fairePipi() {
        System.out.println("Malek fait pipi");
    }

    void faireKaka() {
        System.out.println("Malek fait kaka");
    }
}

class MomoClass implements MalekInterface {
    @Override
    public void faireNImporteQuoi(String param) {

    }

    @Override
    public void raconterDeLaMerde() {

    }
}

