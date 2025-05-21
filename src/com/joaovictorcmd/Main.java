package com.joaovictorcmd;

import com.joaovictorcmd.data.PersonDataLoader;
import com.joaovictorcmd.models.Person;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = PersonDataLoader.loadPeople();

        List<Person> peopleSorted = people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .toList();

        List<Person> brazilians = people.stream()
                .filter(person -> person.getNationality().equalsIgnoreCase("Brazilian"))
                .toList();

        List<Person> japanesesSorted = people.stream()
                .filter(person -> person.getNationality().equalsIgnoreCase("Japanese"))
                .sorted(Comparator.comparing(Person::getName))
                .toList();

        List<Person> mexicansBetween20And30Sorted  = people.stream()
                .filter(person -> person.getNationality().equalsIgnoreCase("Mexican"))
                .filter(person -> (person.getAge() >= 20 && person.getAge() <= 30))
                .sorted(Comparator.comparing(Person::getName))
                .toList();

        System.out.println("-------------------------------------------------------");
        System.out.println("LISTA DESORDENADA");
        System.out.println("-------------------------------------------------------");
        people.forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        System.out.println("LISTA ORDENADA POR ORDEM ALFABÉTICA");
        System.out.println("-------------------------------------------------------");
        peopleSorted.forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        System.out.println("JAPONESES");
        System.out.println("-------------------------------------------------------");
        japanesesSorted.forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        System.out.println("BRASILEIROS");
        System.out.println("-------------------------------------------------------");
        brazilians.forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        System.out.println("MEXICANOS ENTRE 20 E 30 ANOS ORDENADOS");
        System.out.println("-------------------------------------------------------");
        mexicansBetween20And30Sorted.forEach(System.out::println);
    }
}