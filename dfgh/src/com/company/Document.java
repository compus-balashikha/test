package com.company;

public class Document {

    String type;
    String text;
    String number;
    int IgorLox;

    @Override
    public String toString() {
        return "Document{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
