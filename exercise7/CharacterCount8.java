package exercise7;

import java.util.Scanner;

import java.io.*;

public class CharacterCount8 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter a character...");
        while (true) {
            int c = reader.read();
            if (c == -1 || c == 26) {
                break;
            }
            count++;
        }

        System.out.println("Number of characters entered: " + count);
    }
}

