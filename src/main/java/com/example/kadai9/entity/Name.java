package com.example.kadai9.entity;

public class Name {
    private int id;

    private String name;

    private int age;


    public Name(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Name(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void update(String name, int age) {
    }
}
