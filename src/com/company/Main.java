package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String bolshieBukvy = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String malBukvy = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";

        try (FileWriter writer = new FileWriter("alphabet.txt")) {
            for (int i = 0; i < bolshieBukvy.length(); i++) {
                writer.write(bolshieBukvy.charAt(i) + " " + malBukvy.charAt(i) + "\n");
            }

            for (int i = 0; i < num.length(); i++) {
                writer.write(num.charAt(i) + "\n");
            }
        } catch (IOException a) {
            a.getStackTrace();
        }


        try (FileReader bukvy = new FileReader("alphabet.txt")) {
            Scanner scanner = new Scanner(bukvy);
            int i = 1;
            while (scanner.hasNextLine()) {

                System.out.println(i + " :" + " " + scanner.nextLine());
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

