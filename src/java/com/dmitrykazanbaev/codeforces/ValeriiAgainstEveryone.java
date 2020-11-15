package com.dmitrykazanbaev.codeforces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class ValeriiAgainstEveryone {
    public static void main(String[] args) throws Exception {
        String file = "input.txt";
        try (BufferedReader scanner = new BufferedReader(new FileReader(file))) {

            String line = scanner.readLine();
            short count = Short.parseShort(line);
            for (int i = 0; i < count; i++) {
                check(scanner);
            }
        }
    }

    private static void check(BufferedReader scanner) throws IOException {
        short length = Short.parseShort(scanner.readLine());
        String line = scanner.readLine();
        String[] split = line.split(" ");
        HashSet<Integer> currentNumLine = new HashSet<>();
        for (int j = 0; j < length; j++) {
            int currentNum = Integer.parseInt(split[j]);
            if (currentNumLine.contains(currentNum)) {
                System.out.println("YES");
                return;
            }
            currentNumLine.add(currentNum);
        }
        System.out.println("NO");
    }
}
