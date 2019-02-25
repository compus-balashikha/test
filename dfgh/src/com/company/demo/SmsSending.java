package com.company.demo;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class SmsSending {

    public static void main(String[] args) throws Exception {
        String url = "https://smsc.ru/sys/send.php?login=compus&psw=compus_the_best&phones=79067602908,79167648410&mes=Программировать, это хорошо&charset=utf-8";
//        url = "https://google.com/";



//        sendGet(url);

        ArrayList<Integer> cards = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            cards.add(i);
        }
    }






    public static void sendGet(String url) throws Exception {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        InputStream responseStream = con.getInputStream();
        System.out.println(new String(responseStream.readAllBytes()));
    }
}
