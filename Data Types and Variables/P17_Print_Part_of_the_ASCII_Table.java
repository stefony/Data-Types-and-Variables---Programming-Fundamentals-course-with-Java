package exsercise2309_OK;

import java.util.Scanner;

public class P17_Print_Part_of_the_ASCII_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <=end ; i++) {
            System.out.print((char) i + " ");
        }
    }
}
