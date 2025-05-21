package com.joaovictorcmd.models;

import java.util.UUID;

public class Person {

    private UUID id;
    private String name;
    private String nationality;
    private int age;

    public Person() {
    }

    public Person(UUID id, String name, String nationality, int age) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name +
                " ("
                + age +
                ") - "
                +  nationality;
    }
}
