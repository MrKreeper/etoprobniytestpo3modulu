package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main implements Runnable{

    public static void main(String[] args) {
        //File file = new File("test.txt");
        //Scanner scanner = new Scanner(file);
        System.out.println(getListDir("C:\\Users\\Тимофей-ПК\\Desktop\\test")[0]);



    }
    public static String[] getListDir(String path) {
        File file = new File(path);
        return file.list();
    }
    public static void append(String path, String text) throws IOException {
        File file = new File(path);
        FileWriter fr = new FileWriter(file, true);
        fr.write(text);
        fr.close();
    }

    @Override
    public void run() {

    }
}
