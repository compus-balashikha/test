package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {

        SISEM NE ROBIT
                

        int a = 5;
        Integer b = 5;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(8);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(9);
        list.add(8345);

        System.out.println(list);

        int i = 0;
        while (i < list.size()) {
            int element = list.get(i);
            System.out.println(element);
            i = i + 1;
        }

        int sum = 0;
        i = 0;

        while (i < list.size()) {
            int element = list.get(i);
            sum = sum + element;
            i = i + 1;
        }


        int max = list.get(0);

        i = 0;
        while (i < list.size()) {
            int element = list.get(i);
            if (max < element) {
                max = element;
            }
            i = i + 1;
        }

        System.out.println(max);


        System.out.println(sum);







    }
}
