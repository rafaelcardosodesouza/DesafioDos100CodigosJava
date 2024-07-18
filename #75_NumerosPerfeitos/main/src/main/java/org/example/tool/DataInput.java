package org.example.tool;

import java.util.Scanner;

public class DataInput {
    public void validation() {
        Scanner sc = new Scanner(System.in);

        boolean validIput = false;

        while (!validIput) {
            int userNumber = 0;
            try {
                System.out.print("Enter a number: ");
                userNumber = sc.nextInt();
                PerfectNumberChecker.perfectNumberChecker(userNumber);
            } catch (Exception e) {
                System.out.println("Entrada invalida: " + e.getCause());
                sc.next();
            }
        }
    }
}
