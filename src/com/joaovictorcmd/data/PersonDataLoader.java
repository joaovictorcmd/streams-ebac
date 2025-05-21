package com.joaovictorcmd.data;

import com.joaovictorcmd.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PersonDataLoader {

    public static List<Person> loadPeople() {

        List<Person> people = new ArrayList<>();

        people.add(new Person(UUID.randomUUID(), "Fatima Zahra", "American", 29));
        people.add(new Person(UUID.randomUUID(), "Bruno Silva", "Brazilian", 34));
        people.add(new Person(UUID.randomUUID(), "Chen Wei", "Chinese", 41));
        people.add(new Person(UUID.randomUUID(), "Diana Müller", "German", 25));
        people.add(new Person(UUID.randomUUID(), "Elias Zhang", "Chinese", 38));
        people.add(new Person(UUID.randomUUID(), "Alice Carvalho", "Brazilian", 27));
        people.add(new Person(UUID.randomUUID(), "George Smith", "British", 45));
        people.add(new Person(UUID.randomUUID(), "Haruto Tanaka", "Japanese", 31));
        people.add(new Person(UUID.randomUUID(), "Isabel García", "Mexican", 22));
        people.add(new Person(UUID.randomUUID(), "Johan van Dijk", "American", 36));
        people.add(new Person(UUID.randomUUID(), "Laura Mendes", "Brazilian", 30));
        people.add(new Person(UUID.randomUUID(), "Akira Sato", "Japanese", 28));
        people.add(new Person(UUID.randomUUID(), "Emma Thompson", "British", 40));
        people.add(new Person(UUID.randomUUID(), "Carlos Ruiz", "Mexican", 26));
        people.add(new Person(UUID.randomUUID(), "Lena Schneider", "German", 33));
        people.add(new Person(UUID.randomUUID(), "Mohammed Ali", "Lebanese", 39));
        people.add(new Person(UUID.randomUUID(), "Julia Chen", "Chinese", 24));
        people.add(new Person(UUID.randomUUID(), "Rafael Costa", "Brazilian", 35));
        people.add(new Person(UUID.randomUUID(), "Sarah Tan", "Chinese", 29));
        people.add(new Person(UUID.randomUUID(), "Tomás Ortega", "Mexican", 27));
        people.add(new Person(UUID.randomUUID(), "Mika Yamamoto", "Japanese", 32));
        people.add(new Person(UUID.randomUUID(), "Robert Wilson", "American", 42));
        people.add(new Person(UUID.randomUUID(), "Clara Souza", "Brazilian", 31));
        people.add(new Person(UUID.randomUUID(), "Anna Becker", "German", 28));
        people.add(new Person(UUID.randomUUID(), "Pedro Silva", "Brazilian", 34));
        people.add(new Person(UUID.randomUUID(), "Hassan Karim", "Lebanese", 37));
        people.add(new Person(UUID.randomUUID(), "Nina Zhang", "Chinese", 30));
        people.add(new Person(UUID.randomUUID(), "James Anderson", "British", 44));
        people.add(new Person(UUID.randomUUID(), "Marina Torres", "Mexican", 23));
        people.add(new Person(UUID.randomUUID(), "Takashi Kobayashi", "Japanese", 40));
        people.add(new Person(UUID.randomUUID(), "Victor Hugo", "Brazilian", 38));
        people.add(new Person(UUID.randomUUID(), "Linda Müller", "German", 26));
        people.add(new Person(UUID.randomUUID(), "Sofia Ramos", "Mexican", 21));
        people.add(new Person(UUID.randomUUID(), "Leonardo Zhang", "Chinese", 36));
        people.add(new Person(UUID.randomUUID(), "Hiroshi Nakano", "Japanese", 29));
        people.add(new Person(UUID.randomUUID(), "Beatriz Lima", "Brazilian", 33));
        people.add(new Person(UUID.randomUUID(), "Ahmed Mansour", "Lebanese", 41));
        people.add(new Person(UUID.randomUUID(), "Elizabeth White", "British", 43));
        people.add(new Person(UUID.randomUUID(), "Gabriel Kimura", "Japanese", 27));
        people.add(new Person(UUID.randomUUID(), "Patricia Martins", "Brazilian", 39));

        return people;
    }
}

