package com.bvan.oop.lesson6.exception.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class HelloFileReader {

    public static void main(String[] args) {
        try {
            String message = readMessageFromFile("files/hello.txt");
            System.out.println(message);
        } catch (FileNotFoundException e) {
            System.out.println("Some problem exists: " + e.getMessage());
        }
    }

    private static String readMessageFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        String message = scanner.nextLine();
        scanner.close();

        return message;
    }
}
