package com.company;


import java.util.ArrayList;
import java.util.List;

class Main3 {

    public static void main(String[] args) {


        Person person = new Person();

        Person st = new Student();

        person.name = "Vadim";
        person.lastName = "svd";
        person.weight = 60;
        person.height = 160;
        person.age = 32;

        List<Document> documents = new ArrayList<Document>();


        Document passport = new Document();
        passport.number = "324";
        passport.type = "Passport";


        Document prava = new Document();
        prava.number = "324";
        prava.type = "prava";


        documents.add(passport);
        documents.add(prava);

        person.documents = documents;




        System.out.println(person);
    }
}