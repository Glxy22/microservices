package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("file2.txt");
//        System.out.println("file name: " + file.getName() + "  " + file.isFile() + "  " + file.mkdir());


        System.out.println("Hello world!");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            if (file.exists()) {
                writer.append("hello I am here");
                try (Scanner fileinput = new Scanner(file)) {
                    while (fileinput.hasNext()) {
                        String s = fileinput.nextLine();
                        System.out.println(s);
                    }
                }

            }

            writer.println("message my file===== new file");
//            writer.flush();

        } catch (Exception e) {
            System.out.println("e");
        }
        Main obj=new Main();
        obj.stringCheck();
    }
        public void stringCheck(){
            String s= "hello I am Software Developer Nadia";
            String[] s2= s.split(" \\s");  //split on the base of white space character
            for(String x:s2) {
                System.out.println(x);
            }
        }


}