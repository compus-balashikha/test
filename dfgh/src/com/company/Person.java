package com.company;

import java.util.List;

public class Person {

    int age;

    int height;

    int weight;

    String name;

    String lastName;

    List<Document> documents;
int a =10;

    void eat() {
        weight = weight + 1;
    }


    @Override
    public String toString() {
        return "name = " + name + ", weight = " + weight;
    }
}
