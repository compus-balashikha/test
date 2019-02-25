package com.company.demo;

import java.util.ArrayList;

public class NovyFile {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(21);
        integers.add(14);
        integers.add(34);
        integers.add(7);
        integers.add(21);

        int i = 0;
        int b = integers.size();
        while (i < b) {
            int chislo = integers.get(i);
            if (chislo > 12 && chislo < 16) {
                System.out.println(chislo);
            }
            i = i + 1;
        }



    }
}
