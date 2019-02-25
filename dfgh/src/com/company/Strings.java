package com.company;

public class Strings {
    public static void main(String[] args) {


        String name = "asasasasasas";

        int len = name.length();
        int aNumber = 0;

        int i = 0;
        while (i < len) {
            char c = name.charAt(i);
            char x = name.charAt(i - 1);
            if (c == ' ' && x != ' ') {
                aNumber = aNumber + 1;
            }
            i = i + 1;
        }



    }
}
