package com.dmitrykazanbaev.codeforces;

import java.io.BufferedReader;
import java.io.FileReader;

public class SpecificTastesOfAndre {
    public static void main(String[] args) throws Exception {
        String file = "input.txt";
        try (BufferedReader scanner = new BufferedReader(new FileReader(file))) {

            String line = scanner.readLine();
            short count = Short.parseShort(line);
            for (int i = 0; i < count; i++) {
                short length = Short.parseShort(scanner.readLine());

                for (int j = 0; j < length; j++) {
                    System.out.print("1 ");
                }
                System.out.println();
            }
        }
    }
}
