package sample;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int myHp = 100;
        int hisHp = 100;
        int myAttack = 20;
        int hisAttack = 10;

        int round = 1;


        while (myHp > 0 && hisHp > 0) {
            //драка
            myHp = myHp - hisAttack;
            hisHp = hisHp - myAttack;

            System.out.println("Round finished");

            System.out.println("Opponent hp = " + hisHp);

            System.out.println("Round: " + round);
            round = round + 1;

            if (round % 3 == 0) {
                System.out.println("Крит");
            } else {
                System.out.println("обыч");
            }
        }


        if (myHp <= 0 && hisHp <= 0) {
            System.out.println("оба проиграли");
        }

        if (myHp > 0) {
            System.out.println("Я победил");
        }

    }

}