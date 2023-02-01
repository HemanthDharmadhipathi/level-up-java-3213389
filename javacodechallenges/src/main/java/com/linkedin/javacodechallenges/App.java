package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        if (password != null) {
            boolean hasCapitalLetter = false;
            boolean hasSmallLetter = false;
            boolean hasNumber = false;
            char[] c = password.toCharArray();
            int length = c.length;
            if (length >= 6) {
                for (char p : c) {
                    if (p >= 'a' && p <= 'z') {
                        hasSmallLetter = true;
                    } else if (p >= 'A' && p <= 'Z') {
                        hasCapitalLetter = true;
                    } else if (p >= '0' && p <= '9') {
                        hasNumber = true;
                    }

                    if (hasCapitalLetter && hasSmallLetter && hasNumber) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
