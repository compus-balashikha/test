//package com.company;
//
//public class Bolt {
//
//    public static void main(String[] args) {
//
//        int myhp = 100;
//
//        int hishp = 100;
//
//        int myattakck = 15;
//
//        int hisattack = 10;
//
//        int round = 1;
//
//        while (myhp > 0 && hishp > 0) {
//            //драка
//
//            myhp = myhp - hisattack;
//
//            hishp = hishp - myattakck;
//
//            System.out.println("raound finish");
//
//            System.out.println(" opponent hp = " + hishp);
//
//            System.out.println("my hp = " + myhp);
//
//            System.out.println("Round " + round);
//            round = round + 1;
//
//
//            if (round % 3 == 0) {
////                System.out.printlnå("крит");
//            } else {å
//                System.out.println("обычный удар");
//
//            }
//
//            System.out.println();
//
//
//        }
//
//        if (myhp <= 0 && hishp <= 0) {
//
//            System.out.println("оба проиграли");
//
//
//        }
//    }
//}