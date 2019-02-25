package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class FileReadAndWrite {


    public static void main(String[] args) {
        try {
            File folder = new File("./");
            if (folder.isDirectory()) {
                File[] files = folder.listFiles();
                int i = 0;
                while (i < files.length) {
                    File file = files[i];
                    i++;

                    if (file.isDirectory()) {
                        continue;
                    }
                    String str = new String(Files.readAllBytes(file.toPath()));
                    System.out.println(str);
                }
            }
//            File fileDir = new File("temp.txt");
//
//            Writer out = new OutputStreamWriter(new FileOutputStream(fileDir), StandardCharsets.UTF_8);
//
//
//            out.append(str);
//
//
//            out.flush();
//            out.close();
//
//
//
//            System.out.println(str);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


}
